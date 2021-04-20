import javax.sound.midi.*;

public class MiniMiniMusicApp {
    public static void main (String[] args) {
        MiniMiniMusicApp myApp = new MiniMiniMusicApp();
        myApp.Play();
    }

    public void Play () {
        try {
            // Get a sequencer and open it
            Sequencer myPlayer = MidiSystem.getSequencer();
            myPlayer.open();

            // Create new sequencer
            Sequence mySequence = new Sequence(Sequence.PPQ, 4);

            // Ask the sequence for a track. The track lives in 
            // the sequence, and the MIDI data lives in the track
            Track myTrack = mySequence.createTrack();

            // Put some MidiEvents into the Track

            // Make a message
            ShortMessage a = new ShortMessage();
            // Make message start playing note 44
            // Arguments are [command, channel, note to play, velocity]
            a.setMessage(144, 1, 44, 100);
            // Trigger message 'a' at the 1st beat
            MidiEvent noteOn = new MidiEvent(a, 1);
            // Add the midi event to the track, which holds all MidiEvent
            // objects. The sequence organizes them according to the order
            // in which event is to occur then plays them back in that order.
            // Multiple events can occur at the same time as one another.
            myTrack.add(noteOn);

            // Make another message
            ShortMessage b = new ShortMessage();
            // Make message stop playing note 44
            b.setMessage(128, 1, 44, 100);
            // Trigger message 'b' at the 16th beat
            MidiEvent noteOff = new MidiEvent(b, 16);
            // Add the midi event to the track, when the event occurs at
            // the 16th beat, the message 'b' will say to stop playing
            // note 44 on the first channel.
            myTrack.add(noteOff);

            // Change the instrument and make another sound
            ShortMessage c = new ShortMessage();
            // 192 is the command for changing an instrument
            // We are changing the instrument to 102
            c.setMessage(192, 1, 102, 0);
            MidiEvent changeInst = new MidiEvent(c, 17);
            myTrack.add(changeInst);

            // Now play a new sound with the new instrument
            // on a different note.
            ShortMessage d = new ShortMessage();
            d.setMessage(144, 1, 100, 100);
            noteOn = new MidiEvent(d, 18);
            myTrack.add(noteOn);

            ShortMessage e = new ShortMessage();
            e.setMessage(128, 1, 100, 100);
            noteOff = new MidiEvent(e, 34);
            myTrack.add(noteOff);

            // Give the sequence to the seqencer
            myPlayer.setSequence(mySequence);

            // Start the sequencer
            myPlayer.start();
        } catch (MidiUnavailableException mx) {
            System.out.println("Midi file is unavailable or could not be found.");
            mx.printStackTrace();
        } catch (Exception ex) {
            System.out.println("An unknown error has occurred.");
            ex.printStackTrace();
        }
    }
}