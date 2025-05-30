public class SFBook extends Book{

    private int publishYear;
    private boolean bestSeller;

    public SFBook(String title, String author, double price, String language, int publishYear, boolean bestSeller) {
        super(title, author, price, language);
        this.publishYear = publishYear;
        this.bestSeller = bestSeller;
    }

    @Override
    public void printAttributes(){
        System.out.println("SF book info:");
        System.out.println("TItle: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Language: " + language);
        System.out.println("Publish year: " + publishYear);
        System.out.println("Bestseller: " + bestSeller);
    }

    public int getPublishYear() {
        return publishYear;
    }

    public boolean isBestSeller() {
        return bestSeller;
    }

    @Override
    public double getPrice(){
        return price;
    }

}
