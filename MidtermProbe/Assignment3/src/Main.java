public class Main {
    public static void main(String[] args) {

        BookMedia bookMedia = new BookMedia("Title1", "Author1", 45);
        Movie movie = new Movie("Learning AI", "Author2", 60.0);

        Media[] mediaList = {bookMedia, movie};

        Library.displayAllMedia(mediaList);


    }
}