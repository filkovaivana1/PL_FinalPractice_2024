public class Magazine extends Publication{

    private int issueNumber;
    private boolean printedMonthly;

    public Magazine(String title, String publisher, int publicationYear, int issueNumber, boolean printedMonthly, double publicationFee) {
        super(title, publisher, publicationYear, publicationFee);
        this.issueNumber = issueNumber;
        this.printedMonthly = printedMonthly;
    }

    public Magazine(String title, String publisher, int publicationYear, double publicationFee) {
        super(title, publisher, publicationYear, publicationFee);
    }

    @Override
    public void printDetails() {
        System.out.println("Magazine info: ");
        System.out.println("Title: " + getTitle());
        System.out.println("Publisher: " + getPublisher());
        System.out.println("Publication year: " + getPublicationYear());
        System.out.println("Publication fee: " + getPublicationFee() + " den");
        System.out.println("Issue number: " + issueNumber);
        System.out.println("Printed monthly: " + printedMonthly);
        System.out.println(" ");
    }

    @Override
    public double getPublicationFee() {
        return publicationFee;
    }

}