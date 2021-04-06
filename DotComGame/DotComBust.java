import java.util.*;

public class DotComBust {
    private GameHelper helper = null;
    private ArrayList<DotCom> dotComsList = null;
    private int NumOfGuesses = 0;
    private boolean DebugMode = false;

    public DotComBust () {
        this(false);
    }

    public DotComBust (Boolean bDebugMode) {
        this.DebugMode = bDebugMode;
        helper = new GameHelper(this.DebugMode);
        dotComsList = new ArrayList<DotCom>();
    }

    private void SetUpGame() {
        // first make some dot comes and give them locations
        DotCom one = new DotCom();
        one.SetName("Pets.com");

        DotCom two = new DotCom();
        two.SetName("eToys.com");

        DotCom three = new DotCom();
        three.SetName("Go2.com");

        this.dotComsList.add(one);
        this.dotComsList.add(two);
        this.dotComsList.add(three);

        System.out.println("Your goal is to sink three dot coms.");

        String strTemp = null;

        for (int i = 0; i < this.dotComsList.size(); i++) {
            DotCom tempCom = this.dotComsList.get(i);

            strTemp += tempCom.GetName();

            if (i + 1 != this.dotComsList.size()) {
                strTemp += ", ";
            } else {
                strTemp += ".";
            }
        }

        System.out.println(strTemp);

        System.out.println("Try to sink them all in the fewest number of guesses.");

        for (DotCom dotComToSet : this.dotComsList) {
            ArrayList<String> newLocation = this.helper.PlaceDotCom(3);
            dotComToSet.SetLocationCells(newLocation);
        }
    }

    private void StartPlaying () {
        while (!this.dotComsList.isEmpty()) {
            String strUserGuess = this.helper.GetUserInput("Enter a guess");
            this.CheckUserGuess(strUserGuess);
        }

        this.FinishGame();
    }

    private void CheckUserGuess (String strUserGuess) {
        this.NumOfGuesses++;
        String strResult = "miss";

        for (DotCom dotComToTest : this.dotComsList) {
            strResult = dotComToTest.CheckYourself(strUserGuess);

            if (strResult.equals("hit")) {
                break;
            }

            if (strResult.equals("kill")) {
                this.dotComsList.remove(dotComToTest);
                break;
            }
        }

        System.out.println(strResult);
    }

    private void FinishGame () {
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");

        if (this.NumOfGuesses <= 18) {
            System.out.println("It only took you " + this.NumOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options.");
        }
    }

    public static void main (String[] args) {
        boolean DebugMode = false;

        for (String arg : args) {
            // Debug
            //System.out.println(arg);

            if (arg.equals("-Debug=true") || arg.equals("-Debug=yes")) {
                DebugMode = true;
            }
        }

        if (DebugMode) {
            System.out.println("Debug Mode: " + DebugMode + "\n");
        }

        DotComBust game = new DotComBust(DebugMode);
        game.SetUpGame();
        game.StartPlaying();
    }
}