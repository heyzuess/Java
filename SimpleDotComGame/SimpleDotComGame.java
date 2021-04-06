public class SimpleDotComGame {
    public static void main (String[] args) {
        int intNumOfGuesses = 0;
        
        GameHelper helper = new GameHelper();
        SimpleDotCom theDotCom = new SimpleDotCom();
        
        int intRandomNum = (int) (Math.random() * 5);
        int[] intLocations = {
            intRandomNum, intRandomNum + 1, intRandomNum + 2
        };

        theDotCom.SetLocationCells(intLocations);

        boolean bIsAlive = true;

        while (bIsAlive) {
            String strGuess = helper.GetUserInput("Enter a number");
            String strResult = theDotCom.CheckYourself(strGuess);

            intNumOfGuesses++;

            if (strResult.equals("kill")) {
                bIsAlive = false;
                System.out.println("You took " + intNumOfGuesses + " guesses");
            }
        }
    }
}