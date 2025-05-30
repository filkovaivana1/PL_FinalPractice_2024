import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        for(int i=0; i<3; i++){
            System.out.println("Enter a title:");
            String title = scanner.nextLine();
            System.out.println("Enter a author:");
            String author = scanner.nextLine();

            double price = 0;
            while (true) {
                System.out.println("Enter price:");
                try{
                    price = scanner.nextDouble();
                    scanner.nextLine();

                    if (price >= 0) {
                        break;
                    } else {
                        System.out.println("Price needs to be positive");
                         scanner.nextLine();                    }

                } catch (NumberFormatException e) {
                    System.out.println("No valid input for price");
                }

            }
            Book book = new Book(title, author, price);
            library.addBook(book);
        }

        library.displayAllBooks();

        System.out.println("Enter author to check books");
        String authorToFind = scanner.nextLine();
        library.findBooksByAuthor(authorToFind);
        library.sortBooks();
        System.out.println("After sorting");
        library.displayAllBooks();
    }
}

//Create a Book class with attributes:
//
//title (String)
//author (String)
//price (double)
//In a Library class, add:
//
//A Book[] books array to store multiple book instances.
//addBook(Book book): Method to add a book to the array.
//displayAllBooks(): Method to display all books in the library.
//Demonstration:
//
//Prompt the user to enter details for three books.
//Display all entered book details.
//Part (b) – Searching and Sorting (15 Points)
//Search Method:
//
//Add findBooksByAuthor(String author) to Library to search and print books by a specific author.
//Sorting Method:
//
//sortBooksByPrice(): Sorts books by price in ascending order.
//Display the list before and after sorting.
//Example Output:
//
//Allow the user to enter an author’s name to search for matching books.
//Display books sorted by price before and after calling sortBooksByPrice().