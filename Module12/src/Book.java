public abstract class Book {

    private String title;
    private String author;
    double price;
    private int language;

    public Book() {
    }

    public Book(String title, String author, double price, int language) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.language = language;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }


    public int getLanguage() {
        return language;
    }

    public abstract void printAttributes();
    public abstract double getPrice();
}
