public abstract class Publication {

    private String title;
    private String publisher;
    private int publicationYear;
    protected double publicationFee;

    public abstract void printDetails();
    public abstract double getPublicationFee();

    public Publication(String title, String publisher, int publicationYear, double publicationFee) {
        this.title = title;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.publicationFee = publicationFee;
    }

    public Publication() {
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}