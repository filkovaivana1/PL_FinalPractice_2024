public abstract class Book {
    private String title;
    private String author;
    protected double price;
    private String language;

    public Book() {
    }

    public Book(String title, String author, double price, String language) {
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

    public String getLanguage() {
        return language;
    }

    public abstract void printAttributes();
    public abstract double getPrice();
    }


