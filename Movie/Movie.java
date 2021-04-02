public class Movie {
    String Title;
    String Genre;
    int Rating;

    void PlayIt() {
        System.out.println("Playing the movie");
    }

    @Override
    public String toString() {
        return " Title: " + this.Title + "\n" +
               " Genre: " + this.Genre + "\n" +
               "Rating: " + this.Rating;
    }
}