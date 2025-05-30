public class AdventureBook extends Book{

    int publishYear;
    boolean childrenBook;

    public AdventureBook(String title, String author, double price, int language, int publishYear, boolean childrenBook) {
        super(title, author, price, language);
        this.publishYear = publishYear;
        this.childrenBook = childrenBook;
    }


    public int getPublishYear() {
        return publishYear;
    }

    public boolean isChildrenBook() {
        return childrenBook;
    }

    @Override
    public void printAttributes(){
        System.out.println("AdventureBook - title:" + getTitle() + ", author: " + getAuthor() + ", language: " + getLanguage() + "publishYear: " + publishYear + "childrenBook: " + childrenBook + ", price: "  + getPrice());
    }

    @Override
    public double getPrice(){
        return price;
    }

}
