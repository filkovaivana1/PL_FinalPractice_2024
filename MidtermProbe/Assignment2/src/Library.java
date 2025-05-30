import java.util.ArrayList;
import java.util.Comparator;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayAllBooks(){
        for (Book book : books) {
            System.out.println("Book: " + book);
        }
    }

    public void findBooksByAuthor(String author) {
        System.out.println("Books for author " + author);
        boolean found = false;
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                found = true;
                System.out.println("Book:" + book);
            }
        }
        if(!found){
            System.out.println("NO book of entered author was found");
        }
    }

    public void sortBooks() {
        books.sort(Comparator.comparingDouble(Book::getPrice));
    }
}
