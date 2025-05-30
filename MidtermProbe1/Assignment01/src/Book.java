public class Book extends Media{
   int numPage;

    public Book(String title, String creator, int numPage) {
        super(title, creator);
        this.numPage = numPage;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Number of pages: " + numPage);
    }
    public void readSample(){
        System.out.println("The sample pages are ready to read.");

    }
}
