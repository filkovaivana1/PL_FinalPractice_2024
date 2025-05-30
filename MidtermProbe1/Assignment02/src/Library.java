import java.util.ArrayList;
import java.util.Comparator;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void displayAllBooks(){
        for (Book book: books){
            System.out.println(book);
        }
    }

    public void findBookByAuthor(String author){
        System.out.println("All books by author:" + author);
        for (Book book: books){

            if (book.getAuthor().equalsIgnoreCase(author)){
                System.out.println(book);
            }
        }

    }

    public void sortByPrice(){
        books.sort(Comparator.comparingDouble(Book::getPrice));
    }

}
