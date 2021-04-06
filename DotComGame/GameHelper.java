import java.io.*;
import java.util.*;

public class GameHelper {
    private static final String alphabet = "abcdefg";
    private int intGridLength = 7;
    private int intGridSize = 49;
    private int[] intGrid = new int[this.intGridSize];
    private int  intComCount = 0;
    private boolean DebugMode = false;

    public GameHelper () {
        this(false);
    }

    public GameHelper (boolean bDebugMode) {
        this.DebugMode = bDebugMode;
    }

    public String GetUserInput (String strPrompt) {
        String strInputLine = null;
        
        System.out.println(strPrompt + " ");

        try {
            BufferedReader BufferReader = new BufferedReader(new InputStreamReader(System.in));
            strInputLine = BufferReader.readLine();

            if (strInputLine.length() == 0) {
                return null;
            }
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }

        return strInputLine.toLowerCase();
    }

    public ArrayList<String> PlaceDotCom (int intComSize) {
        ArrayList<String> alphaCells = new ArrayList<String>();
        // holds 'f6' type coords
        String[] strAlphaCoords = new String[intComSize];
        // temporary string for concat
        String strTemp = null;
        // current candidate coords
        int[] intCoords = new int[intComSize];
        // current attempts counter
        int intAttempts = 0;
        // flag = found a good location ?
        boolean bSuccess = false;
        // current starting location
        int intLocation = 0;

        // nth dot com to place
        intComCount++;
        // set horizontal incriment
        int intIncr = 1;
        // if odd dot com (place vertically)
        if ((intComCount % 2) == 1) {
            // set vertical incriment
            intIncr = intGridLength;
        }

        // main search loop
        while ( !bSuccess & intAttempts++ < 200 ) {
            // get random starting point
            intLocation = (int) (Math.random() * intGridSize);

            // Debug
            this.Debug(" try " + intLocation);

            // nth position in dotcom to place
            int intX = 0;
            // assume success
            bSuccess = true;

            // look for adjacent unused spots
            while (bSuccess && intX < intComSize) {
                // if not already used
                if (intGrid[intLocation] == 0) {
                    // save location
                    intCoords[intX++] = intLocation;
                    // try 'next' adjacent
                    intLocation += intIncr;
                
                    // out of bounds - bottom edge
                    if (intLocation >= intGridSize) {
                        // failure
                        bSuccess = false;
                    }

                    // out of bounds - right edge
                    if (intX > 0 && (intLocation % intGridLength == 0)) {
                        // failure
                        bSuccess = false;
                    }
                } else {
                    // found already in used location
                    
                    // Debug
                    this.Debug(" used " + intLocation);

                    // failure
                    bSuccess = false;
                }
            }
        }

        // turn location into alpha coords
        int intX = 0;
        int intRow = 0;
        int intColumn = 0;

        // Debug
        this.Debug("\n");

        while (intX < intComSize) {
            // mark master grid pts. as 'used'
            intGrid[intCoords[intX]] = 1;
            // get row value
            intRow = (int) (intCoords[intX] / intGridLength);
            // get numeric column value
            intColumn = intCoords[intX] % intGridLength;
            // convert to alpha
            strTemp = String.valueOf(alphabet.charAt(intColumn));

            alphaCells.add(strTemp.concat(Integer.toString(intRow)));
            intX++;

            // Debug
            // where is the dot com located
            this.Debug(" coord " + intX + " = " + alphaCells.get(intX - 1));
        }

        // Debug
        this.Debug("\n");

        return alphaCells;
    }

    // If logical flag true then output messages to console
    private void Debug (String strMessage) {
        if (this.DebugMode) {
            System.out.println("Debug: \t" + strMessage);
        }
    }
}
