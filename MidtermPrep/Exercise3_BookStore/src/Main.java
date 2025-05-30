import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        for (int i=0; i<=3; i++) {
            System.out.println("Enter details for Book: " + i + ": ");

            System.out.println("Title: ");
            String title = scanner.nextLine();

            System.out.println("Author: ");
            String author = scanner.nextLine();


            double price = 0;
            while (true) {
                System.out.println("Enter price for book: ");
                if(scanner.hasNextDouble()) {
                    price = scanner.nextDouble();
                    scanner.nextLine();
                    if (price >= 0) {
                        break;
                    } else {
                        System.out.println("PRvice can not be negative, enter again");
                    }
                } else {
                    System.out.println("Invalid input, price should be numverical value! ");
                }
                scanner.next();
            }

            Book book = new Book(title, author, price);
            library.addBook(book);
            System.out.println();

        }

        library.displayAllBooks();

        System.out.println("Enter author for searching books: ");
        String authorInput = scanner.nextLine();
        library.findBookByAuthor(authorInput);

        library.sortBooksByPrice();

        library.displayAllBooks();


        scanner.close();




    }
}
//public class LibraryDemoPartA {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Library library = new Library();
//
//        // Prompt user to enter details for three books
//        for (int i = 1; i <= 3; i++) {
//            System.out.println("Enter details for Book " + i + ":");
//
//            System.out.print("Title: ");
//            String title = scanner.nextLine();
//
//            System.out.print("Author: ");
//            String author = scanner.nextLine();
//
//            double price = 0;
//            while (true) {
//                System.out.print("Price: ");
//                if (scanner.hasNextDouble()) {
//                    price = scanner.nextDouble();
//                    scanner.nextLine(); // Consume newline
//                    if (price >= 0) {
//                        break;
//                    } else {
//                        System.out.println("Price cannot be negative. Please enter again.");
//                    }
//                } else {
//                    System.out.println("Invalid input. Please enter a numerical value.");
//                    scanner.next(); // Clear invalid input
//                }
//            }
//
//            Book book = new Book(title, author, price);
//            library.addBook(book);
//            System.out.println();
//        }
//
//        // Display all entered book details
//        System.out.println("Books in the Library:");
//        library.displayAllBooks();
//
//        scanner.close();
//    }
//}

///////////////////////////////////////////////////////////////////////////////////

//public class LibraryDemoPartB {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Library library = new Library();
//
//        // Adding three books as per Part (a)
//        for (int i = 1; i <= 3; i++) {
//            System.out.println("Enter details for Book " + i + ":");
//
//            System.out.print("Title: ");
//            String title = scanner.nextLine();
//
//            System.out.print("Author: ");
//            String author = scanner.nextLine();
//
//            double price = 0;
//            while (true) {
//                System.out.print("Price: ");
//                if (scanner.hasNextDouble()) {
//                    price = scanner.nextDouble();
//                    scanner.nextLine(); // Consume newline
//                    if (price >= 0) {
//                        break;
//                    } else {
//                        System.out.println("Price cannot be negative. Please enter again.");
//                    }
//                } else {
//                    System.out.println("Invalid input. Please enter a numerical value.");
//                    scanner.next(); // Clear invalid input
//                }
//            }
//
//            Book book = new Book(title, author, price);
//            library.addBook(book);
//            System.out.println();
//        }
//
//        // Display all books
//        System.out.println("Books in the Library:");
//        library.displayAllBooks();
//
//        // Search for books by author
//        System.out.print("Enter the author to search for: ");
//        String searchAuthor = scanner.nextLine();
//        library.findBooksByAuthor(searchAuthor);
//
//        // Display books before sorting
//        System.out.println("\nBooks before sorting by price:");
//        library.displayBooksSimplified();
//
//        // Sort books by price
//        library.sortBooksByPrice();
//
//        // Display books after sorting
//        System.out.println("Books after sorting by price:");
//        library.displayBooksSimplified();
//
//        scanner.close();
//    }
//}