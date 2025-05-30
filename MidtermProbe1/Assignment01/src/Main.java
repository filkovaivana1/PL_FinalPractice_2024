public class Main {
    public static void main(String[] args) {
        Media[] medias = new Media[2];
        medias[0] = new Book("Title1","Author1",50);
        medias[1] = new Movie("Predator","nekojsi",120);
        Library library = new Library();
        library.displayAllInfo(medias);
    }
}