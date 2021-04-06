public class GuessGame {
    Player Player1;
    Player Player2;
    Player Player3;

    public void StartGame() {
        Player1 = new Player();
        Player2 = new Player();
        Player3 = new Player();

        int intGuess1 = 0;
        int intGuess2 = 0;
        int intGuess3 = 0;

        boolean bCorrect1 = false;
        boolean bCorrect2 = false;
        boolean bCorrect3 = false;

        int intTargetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        while (true) {
            System.out.println("Number to guess is " + intTargetNumber);

            Player1.Guess();
            Player2.Guess();
            Player3.Guess();

            intGuess1 = Player1.Number;
            System.out.println("Player one guessed " + intGuess1);
            
            intGuess2 = Player2.Number;
            System.out.println("Player two guessed " + intGuess2);

            intGuess3 = Player3.Number;
            System.out.println("Player three guessed " + intGuess3);

            if (intGuess1 == intTargetNumber) {
                bCorrect1 = true;
            }
            
            if (intGuess2 == intTargetNumber) {
                bCorrect2 = true;
            }

            if (intGuess3 == intTargetNumber) {
                bCorrect3 = true;
            }

            if (bCorrect1 || bCorrect2 || bCorrect3) {
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + bCorrect1);
                System.out.println("Player two got it right? " + bCorrect2);
                System.out.println("Player three got it right? " + bCorrect3);
                System.out.println("Game is over.");
                break; // ganme is over so break out of the loop
            } else {
                // we must keep going because nobody got it right!
                System.out.println("Players will have to try again.");
            }
        }
    }
}