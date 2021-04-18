import javax.sound.midi.*;
import static java.lang.System.out;

public class MusicTest1 {
    public static void main (String[] args) {
        MusicTest1 myMusicTest = new MusicTest1();
        myMusicTest.Play();
    }
    
    public void Play () {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            
            out.println("Sequencer created");
        } catch (MidiUnavailableException e) {
            String strStack = e.getStackTrace().toString();
            
            out.println("An error occurred creating sequencer");
            out.println(strStack);
        }
    }

    public boolean TryParse (String strTemp,
                             Integer[] intVal) {
        int intTemp = intVal[0];
        try {
            intVal[0] = Integer.parseInt(strTemp);
        } catch (NumberFormatException e) {
            intVal[0] = intTemp;
            return false;
        }

        return true;
    }
}