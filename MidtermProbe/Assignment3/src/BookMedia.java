public class BookMedia extends Media{
    private int numPages;

    public BookMedia(String title, String creator, int numPages) {
        super(title, creator);
        this.numPages = numPages;
    }

    public void readSample() {
        System.out.println("The book can be accessed");
    }

    @Override
    public void displayInfo(){

        super.displayInfo();
        System.out.println("Number of pages: " + numPages);
    }
}
