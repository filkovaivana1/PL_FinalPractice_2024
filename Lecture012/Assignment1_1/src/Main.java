import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        List<AdventureBook> adventureBooks = new ArrayList<>();
        List<SFBook> sfBooks = new ArrayList<>();

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int choice = 0;
        boolean exit = false;
        while (true){

            System.out.println("Enter some choice: ");
            System.out.println("1 - Input SF book");
            System.out.println("2 - Input Adventure book");
            System.out.println("3 - List all books");
            System.out.println("4 - List the oldest book");
            System.out.println("5 - Most expensive book");
            System.out.println("6 - Average price of all books");
            System.out.println("7 - EXIT");

            try {
                choice = Integer.parseInt(bufferedReader.readLine());

                switch (choice){
                    case 1:
                        System.out.println("ENter SF title:");
                        String title = bufferedReader.readLine();

                        System.out.println("ENter SF author:");
                        String author = bufferedReader.readLine();

                        System.out.println("ENter SF price: ");
                        double price = Double.parseDouble(bufferedReader.readLine());

                        System.out.println("ENter language: ");
                        String language = bufferedReader.readLine();

                        System.out.println("Ënter SF publish year: ");
                        int publishYEar = Integer.parseInt(bufferedReader.readLine());

                        System.out.println("Is it bestseller: ");
                        boolean bestSeller = Boolean.parseBoolean(bufferedReader.readLine());

                        SFBook sfBook = new SFBook(title, author, price, language, publishYEar, bestSeller);
                        sfBooks.add(sfBook);
                        books.add(sfBook);
                        break;

                    case 2:
                        System.out.println("ENter Adventure title:");
                        String title1 = bufferedReader.readLine();

                        System.out.println("ENter Adventure author:");
                        String author1 = bufferedReader.readLine();

                        System.out.println("ENter Adventure price: ");
                        double price1 = Double.parseDouble(bufferedReader.readLine());

                        System.out.println("ENter Adventure language: ");
                        String language1 = bufferedReader.readLine();

                        System.out.println("Ënter Adventure publish year: ");
                        int publishYEar1 = Integer.parseInt(bufferedReader.readLine());

                        System.out.println("Is it children book: ");
                        boolean childrenBook = Boolean.parseBoolean(bufferedReader.readLine());

                        AdventureBook adventureBook = new AdventureBook(title1, author1, price1, language1, publishYEar1, childrenBook);
                        adventureBooks.add(adventureBook);
                        books.add(adventureBook);
                        break;
                    case 3:
                        System.out.println("Listing all books: ");
                        books.stream().forEach(book -> book.printAttributes());
                        break;

                    case 4:
                        System.out.println("Oldest book: ");
                        books.stream().min(Comparator.comparingInt(book ->
                                {
                                    if(book instanceof SFBook) {
                                        return ((SFBook) book).getPublishYEar();
                                    } else {
                                        return ((AdventureBook) book).getPublishYear();
                                    }
                                }
                                )).ifPresent(book -> book.printAttributes());
                        break;

                    case 5:
                        System.out.println("Most expensive book:");
                        books.stream().max(Comparator.comparingDouble(book -> book.getPrice())).ifPresent(mostExpensive -> mostExpensive.printAttributes());
                        break;

                    case 6:
                        System.out.println("Average price: " + books.stream().collect(Collectors.averagingDouble(book -> book.getPrice())));
                        break;
                    case 7:
                        System.out.println("You are exiting teh program");
                        exit = true;
                        break;
                    default:
                        System.out.println("No such choice");
                }

                if(exit) break;

            } catch (IOException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException numberFormatException) {
                System.out.println(numberFormatException.getMessage());
            }




        }


    }
}