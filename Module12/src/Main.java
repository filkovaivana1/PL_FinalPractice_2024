import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ArrayList<SFBook> sfBooks = new ArrayList<>();
        ArrayList<AdventureBook> adventureBooks = new ArrayList<>();
        ArrayList<Book> books = new ArrayList<>();
        sfBooks.add(new SFBook("SFtitle1", "Author1", 1000.0, 1, 2021, true));
        sfBooks.add(new SFBook("SFtitle2", "Author2", 2000.0, 2, 2020, true));
        sfBooks.add(new SFBook("SFtitle3", "Author3", 500.0, 0, 2024, false));

        adventureBooks.add(new AdventureBook("ABtitle1", "Author11", 1000.0, 1, 2021, true));
//        adventureBooks.add(new SFBook("ABtitle2", "Author22", 2000.0, 2, 2020, false));
//        adventureBooks.add(new SFBook("ABtitle3", "Author3", 500.0, 0, 2024, false));

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(isr);

        boolean exit = false;

        while(true) {
            int choice = 0;
            System.out.println("Choose option: ");
            System.out.println("1 - Input SF book");
            System.out.println("2 - Input Adventure book");
            System.out.println("3 - List all books");
            System.out.println("4 - List the oldest book");
            System.out.println("5 - list the most expensive book");
            System.out.println("6 - list the average price for all books");
            System.out.println("7 - exit the program");


            try {
                choice = Integer.parseInt(bufferedReader.readLine());

                switch (choice) {
                    case 1:
                        System.out.println("ENter title: ");
                        String title  = bufferedReader.readLine();
                        System.out.println("Enter author: ");
                        String author = bufferedReader.readLine();
                        System.out.println("Enter price: ");
                        double price = Double.parseDouble(bufferedReader.readLine());
                        System.out.println("Enter language: ");
                        int language = Integer.parseInt(bufferedReader.readLine());
                        System.out.println("Enter publish year: ");
                        int publishYear = Integer.parseInt(bufferedReader.readLine());
                        System.out.println("Is it a bestseller ? (true / false) ");
                        boolean bestseller = Boolean.parseBoolean(bufferedReader.readLine());
                        sfBooks.add(new SFBook(title, author, price, language, publishYear, bestseller));
                        books.add(new SFBook(title, author, price, language, publishYear, bestseller));
                        break;
                    case 2:
                        System.out.println("ENter title: ");
                        String title1  = bufferedReader.readLine();
                        System.out.println("Enter author: ");
                        String author1 = bufferedReader.readLine();
                        System.out.println("Enter price: ");
                        double price1 = Double.parseDouble(bufferedReader.readLine());
                        System.out.println("Enter language: ");
                        int language1 = Integer.parseInt(bufferedReader.readLine());
                        System.out.println("Enter publish year: ");
                        int publishYear1 = Integer.parseInt(bufferedReader.readLine());
                        System.out.println("Is it a children book ? (true / false) ");
                        boolean childrenBook = Boolean.parseBoolean(bufferedReader.readLine());
                        adventureBooks.add(new AdventureBook(title1, author1, price1, language1, publishYear1, childrenBook));
                        books.add(new AdventureBook(title1, author1, price1, language1, publishYear1, childrenBook));
                        break;

                    case 3:
                        sfBooks.stream().forEach(sfBook -> sfBook.printAttributes());
                        adventureBooks.stream().forEach(adventureBook -> adventureBook.printAttributes());
                        break;
                    case 4:
                        System.out.println("Finding oldest book: ");
                         books.stream().min(Comparator.comparingInt(book -> {
                           if(book instanceof SFBook)
                               return ((SFBook) book).getPublishYear();
                           else
                               return ((AdventureBook) book).getPublishYear();
                        })).ifPresent(oldestBook -> {
                             System.out.println("Oldest book found: ");
                            oldestBook.printAttributes();});
//                        System.out.println("Oldest book: " );
//                        oldest1.printAttributes();

                        AdventureBook oldest2 = adventureBooks.stream().min(Comparator.comparingInt(sfBook -> sfBook.publishYear)).get();
//                        if(oldest1.publishYear < oldest2.publishYear) oldest1.printAttributes();
//                        else oldest2.printAttributes();
                        break;
                    case 5:
                        System.out.println("MOst expensive book is: ");
                        books.stream().max(Comparator.comparingDouble(sfBook -> sfBook.getPrice())).ifPresent(mostExpensiveBook -> mostExpensiveBook.printAttributes());
                        break;
                    case 6:
                        System.out.println("Average price calculation: " + sfBooks.stream().collect(Collectors.averagingDouble(Book::getPrice)));

                        break;
                    case 7:
                        System.out.println("Exiting the program");
                        exit = true;
                        break;
                    default:
                        System.out.println("No such option");
                }

            if (exit) {
                break;
            }


            } catch (Exception e) {
                System.out.println(e);
            }

        }



    }
}