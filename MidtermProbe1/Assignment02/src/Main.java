import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        for(int i =0; i<3; i++){
            System.out.println("Book " + (i+1));
            System.out.println("Enter title:");
            String title = scanner.nextLine();

            System.out.println("Enter author:");
            String author = scanner.nextLine();

            double price;
            while (true) {
                try {
                    System.out.println("Enter price");
                    price = scanner.nextDouble();
                    scanner.nextLine();
                    if (price >= 0) {
                            break;
                    } else {
                        System.out.println("Price need to be positive");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Invalid input");
                }
                scanner.next();
            }
        Book book = new Book(title, author, price);
            library.addBook(book);

        }

        library.displayAllBooks();
        System.out.println("Enter author to search books:");
        String authorToSearch = scanner.nextLine();
        library.findBookByAuthor(authorToSearch);
        library.sortByPrice();
        System.out.println("After sorting");
        library.displayAllBooks();
    }
}