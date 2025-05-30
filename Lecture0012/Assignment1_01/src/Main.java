import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<SFBook> sfBooks = new ArrayList<>();
        List<AdventureBook> adventureBooks = new ArrayList<>();
        List<Book> books = new ArrayList<>();
        int input = 0;
        boolean exit = false;
        while (true){
            System.out.println("Choose something: ");
            System.out.println("1 - Input SF book");
            System.out.println("2 - Input Adventure book");
            System.out.println("3 - List all books");
            System.out.println("4 - List oldest book");
            System.out.println("5 - Get most expensive book");
            System.out.println("6 - Get average price of all books");
            System.out.println("7 - EXIT the program");

            try {
                input = Integer.parseInt(scanner.nextLine());

                switch (input) {
                    case 1:
                        System.out.println("Enter SF book title:");
                        String title = scanner.nextLine();
                        System.out.println("Enter SF book author: ");
                        String author = scanner.nextLine();
                        System.out.println("ENter price: ");
                        double price = Double.parseDouble(scanner.nextLine());
                        System.out.println("Enter language: ");
                        String language = scanner.nextLine();
                        System.out.println("ENter publish year: ");
                        int publishYEar = Integer.parseInt(scanner.nextLine());
                        System.out.println("Is it bestseller ?");
                        boolean bestSeller = Boolean.parseBoolean(scanner.nextLine());

                        SFBook sfBook = new SFBook(title, author, price, language, publishYEar, bestSeller);
                        sfBooks.add(sfBook);
                        books.add(sfBook);
                        break;
                    case 2:
                        System.out.println("Enter Adventure book title:");
                        String title1 = scanner.next();
                        System.out.println("Enter author: ");
                        String author1 = scanner.nextLine();
                        System.out.println("ENter price: ");
                        double price1 = scanner.nextDouble();
                        System.out.println("Enter language: ");
                        String language1 = scanner.nextLine();
                        System.out.println("ENter publish year: ");
                        int publishYEar1 = scanner.nextInt();
                        System.out.println("Is it children book ?");
                        boolean childrenBOok = scanner.nextBoolean();

                        AdventureBook adventureBook = new AdventureBook(title1, author1, price1, language1, publishYEar1, childrenBOok);
                        adventureBooks.add(adventureBook);
                        books.add(adventureBook);
                        break;

                    case 3:
                        System.out.println("Listing all the books");
                        sfBooks.stream().forEach(book -> book.printAttributes());
                        adventureBooks.stream().forEach(book -> book.printAttributes());
                        break;
                    case 4:
                        System.out.println("Getting the oldest book: ");
                        books.stream().min(Comparator.comparingInt(book -> {
                            if (book instanceof AdventureBook) {
                                return ((AdventureBook) book).getPublishYear();
                            } else {
                                return ((SFBook) book).getPublishYear();
                            }
                        })).ifPresent(oldestBook -> oldestBook.printAttributes());
                        break;
                    case 5:
                        System.out.println("PRint most expensive book:");
                        books.stream().max(Comparator.comparingDouble(book -> book.getPrice())).ifPresent(mostExpensiveBook -> mostExpensiveBook.printAttributes());
                        break;
                    case 6:
                        System.out.println("Average price: " + books.stream().collect(Collectors.averagingDouble(book -> book.getPrice())));
                        break;
                    case 7:
                        System.out.println("You are exiting the program");
                        exit = true;
                        break;
                    default:
                        System.out.println("NO such choice");
                }

                if (exit) break;

            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }


    }
}