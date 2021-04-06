import java.io.*;

public class GameHelper {
    public String GetUserInput (String strPrompt) {
        String strInputLine = null;
        
        System.out.println(strPrompt + " ");

        try {
            BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
            strInputLine = bufferReader.readLine();
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }

        return strInputLine;
    }
}
