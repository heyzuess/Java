import javax.sound.midi.*;
import static java.lang.System.out;

public class MiniMusicCmdLine {
    public static void main (String[] args) {
        MiniMusicCmdLine myApp = new MiniMusicCmdLine();
        
        if (args.length < 2) {
            out.println("Dont forget the instrument and note args");
        } else {
            int intInstrument = 0;
            int intNote = 0;
            Integer[] intParse = new Integer[] {intInstrument};

            if (!myApp.ParseInt(args[0], intParse)) {
                out.println("Argument 1 must be an integer");
                return;
            }

            intInstrument = intParse[0];
            intParse[0] = intNote;

            if (!myApp.ParseInt(args[1], intParse)) {
                out.println("Argument 2 must be an integer");
                return;
            }

            intNote = intParse[0];
            
            myApp.Play(intInstrument, intNote);
        }
    }

    public void Play (int intInstrument, int intNote) {        
        try {
            Sequencer myPlayer = MidiSystem.getSequencer();
            myPlayer.open();
            Sequence mySequence = new Sequence(Sequence.PPQ, 4);
            Track myTrack = mySequence.createTrack();

            //MidiEvent myEvent = null;

            ShortMessage firstMsg = new ShortMessage();
            firstMsg.setMessage(192, 1, intInstrument, 0);
            MidiEvent changeInstrument = new MidiEvent(firstMsg, 1);
            myTrack.add(changeInstrument);

            ShortMessage secondMsg = new ShortMessage();
            secondMsg.setMessage(144, 1, intNote, 100);
            MidiEvent noteOn = new MidiEvent(secondMsg, 1);
            myTrack.add(noteOn);

            ShortMessage thirdMsg = new ShortMessage();
            thirdMsg.setMessage(128, 1, intNote, 100);
            MidiEvent noteOff = new MidiEvent(thirdMsg, 16);
            myTrack.add(noteOff);

            myPlayer.setSequence(mySequence);
            myPlayer.start();
        } catch (MidiUnavailableException mx) {
            out.println("Midi file unavailable or could not be found.");
            mx.printStackTrace();
        } catch (Exception ex) {
            out.println("An unknown error has occurred.");
            ex.printStackTrace();
        }
    }

    public Boolean ParseInt (String strVal, Integer[] intVal) {
        Integer intTemp = intVal[0];
        
        try {
            intVal[0] = Integer.parseInt(strVal);
        } catch (Exception ex) {
            intVal[0] = intTemp;
            return false;
        }
        return true;
    }
}