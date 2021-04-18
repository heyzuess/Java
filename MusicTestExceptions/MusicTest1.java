import java.io.Console;
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

        try {
            out.println("Please select an option:");
            out.println("0 - No error");
            out.println("1 - PantsException");
            out.println("2 - LingerieException");
            out.println();

            Integer intVal = 0;
            Integer[] intTemp = new Integer[] {intVal};
            
            String strTemp = System.console().readLine();
            
            if (!TryParse(strTemp, intTemp)) {
                intVal = 0;
            } else {
                intVal = intTemp[0];
            }

            out.println();
            out.println("Running Option: " + intVal.toString());
            out.println();

            TestPlay(intVal);
        } catch (PantsException px) {
            out.println("PantsException has been thrown");
            return;
        } catch (LingerieException lx) {
            out.println("LingerieException has been thrown");
            return;
        }

        out.println("No error has been selected");
    }

    public void TestPlay(int intType) throws PantsException, LingerieException {
        switch (intType) {
            case 0:
            return;
            case 1:
            throw new PantsException();
            case 2:
            throw new LingerieException();
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

    public class PantsException extends Exception {
        private static final long serialVersionUID = 0L;
    }

    public class LingerieException extends Exception {
        private static final long serialVersionUID = 0L;
    }
}