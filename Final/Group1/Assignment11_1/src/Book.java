public class Book extends Publication{

    private String author;
    private String ISBN;
    private int pageCount;

    public Book(String title, String publisher, int publicationYear, String author, String ISBN, int pageCount, double publicationFee) {
        super(title, publisher, publicationYear, publicationFee);
        this.author = author;
        this.ISBN = ISBN;
        this.pageCount = pageCount;
    }

    public Book(String title, String publisher, int publicationYear, double publicationFee) {
        super(title, publisher, publicationYear, publicationFee);
    }

    @Override
    public void printDetails() {
        System.out.println("Book info: ");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Publisher: " + getPublisher());
        System.out.println("Publication year: " + getPublicationYear());
        System.out.println("Page count: " + pageCount);
        System.out.println("Publication fee: " + getPublicationFee() + " den");
        System.out.println(" ");

    }

    @Override
    public double getPublicationFee() {
        return publicationFee;
    }
}