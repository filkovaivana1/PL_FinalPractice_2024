public class AdventureBook extends Book {
    private int publishYear;
    private boolean childrenBook;

    public AdventureBook(String title, String author, double price, String language, int publishYear, boolean childrenBook) {
        super(title, author, price, language);
        this.publishYear = publishYear;
        this.childrenBook = childrenBook;
    }

    @Override
    public void printAttributes(){
        System.out.println("Adventure book info: ");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: " + getPrice());
        System.out.println("Language: " + getLanguage());
        System.out.println("Publish year: " + publishYear);
        System.out.println("Children book: " + childrenBook);
    }

    @Override
    public double getPrice(){
        return price;
    }

    public int getPublishYear() {
        return publishYear;
    }
}
