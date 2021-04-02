public class BeerSong {
    public static void main (String[] args) {
        int intBeerNum = 99;
        String strWord = "bottles";

        while (intBeerNum > 0) {
            if (intBeerNum == 1) {
                strWord = "bottle"; // singular, as in ONE bottle.
            }

            System.out.println(intBeerNum + " " + strWord + " of beer on the wall.");
            System.out.println(intBeerNum + " " + strWord + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            intBeerNum--;

            if (intBeerNum > 0) {
                System.out.println(intBeerNum + " " + strWord + " of beer on the wall.\n");
            } else {
                System.out.println("No more bottles of beer on the wall.\n");
            }
        }
    }
}