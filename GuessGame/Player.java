public class Player {
    int Number = 0; // where the guess goes

    public void Guess() {
        this.Number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + this.Number);
    }
}
