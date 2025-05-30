public class SFBook extends Book{

    int publishYear;
    boolean bestSeller;


    public SFBook(String title, String author, double price, int language, int publishYear, boolean bestSeller) {
        super(title, author, price, language);
        this.publishYear = publishYear;
        this.bestSeller = bestSeller;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public boolean isBestSeller() {
        return bestSeller;
    }

    @Override
    public void printAttributes(){
        System.out.println("SFBook - title:" + getTitle() + ", author: " + getAuthor() + ", language: " + getLanguage() + "publishYear: " + publishYear + "bestSeller: " + bestSeller + ", price: "  + getPrice());
    }

    @Override
    public double getPrice(){
        return price;
    }

}
