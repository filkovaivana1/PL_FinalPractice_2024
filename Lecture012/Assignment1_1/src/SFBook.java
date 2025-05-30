public class SFBook extends Book{
    private int publishYEar;
    private boolean bestSeller;


    public SFBook(String title, String author, double price, String language, int publishYEar, boolean bestSeller) {
        super(title, author, price, language);
        this.publishYEar = publishYEar;
        this.bestSeller = bestSeller;
    }

    @Override
    public void printAttributes(){
        System.out.println("SF book info: ");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: " + getPrice());
        System.out.println("Language: " + getLanguage());
        System.out.println("Publish year: " + publishYEar);
        System.out.println("Best seller: " + bestSeller);
    }

    @Override
    public double getPrice(){
        return price;
    }

    public int getPublishYEar() {
        return publishYEar;
    }
}
