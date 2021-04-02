public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.Title = "Gone with the Stock";
        one.Genre = "Tragic";
        one.Rating = -2;

        Movie two = new Movie();
        two.Title = "Lost in Cubicle Space";
        two.Genre = "Comedy";
        two.Rating = 5;

        Movie three = new Movie();
        three.Title = "Byte Club";
        three.Genre = "Tragic but ultimately uplifting";
        three.Rating = 127;

        System.out.println(one.toString() + "\n");
        System.out.println(two.toString() + "\n");
        System.out.println(three.toString() + "\n");
    }
}