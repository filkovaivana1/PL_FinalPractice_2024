import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
       books.add(new Book("CTitle", "Author1", 1000.0, 40));
        books.add(new Book("STitle", "Author2", 4000.0, 10));
        books.add(new Book("HTitle", "Author3", 500.0, 5));
        books.add(new Book("RTitle", "Author4", 2000.0, 30));
        books.add(new Book("ATitle", "Author5", 1200.0, 70));

//        books.sort(Comparator.comparing(book -> book.getTitle()));
//        books.forEach(book -> System.out.println(book));


        List<Book> resultBooks = books.stream().sorted(Comparator.comparing(book -> book.getTitle())).collect(Collectors.toList());
        resultBooks.stream().forEach(book -> System.out.println(book));

        books.stream().max(Comparator.comparingDouble(book -> book.getPrice())).ifPresent(mostExpensive -> System.out.println("Most expensive book: " + mostExpensive));
        books.stream().min(Comparator.comparingDouble(book -> book.getPrice())).ifPresent(cheapest -> System.out.println("Cheapest book: " + cheapest));
        System.out.println(books.stream().anyMatch(book -> book.getQuantity() > 1000));
//        List<Book> books = new ArrayList<>();
//        books.add(new Book("VTitle1", "AUthor1", 1000.0, 500));
//        books.add(new Book("CTitle2", "AUthor2", 4000.0, 50));
//        books.add(new Book("BTitle3", "AUthor3", 200.0, 50));
//        books.add(new Book("ATitle4", "AUthor4", 5000.0, 5));
//        books.add(new Book("OTitle5", "AUthor5", 50000.0, 3));
//
//
////        books.sort(Comparator.comparing(book -> book.getTitle()));
////        books.forEach(book -> System.out.println(book));
////        System.out.println(books);
//
//        System.out.println();
//        List<Book> resultBooks = books.stream().sorted(Comparator.comparing(book -> book.getTitle())).collect(Collectors.toList());
//        resultBooks.forEach(book -> System.out.println(book));
//
//
//        books.stream().max(Comparator.comparingDouble(book -> book.getPrice())).ifPresent(mostExpensive -> System.out.println("Most expensive book: "+ mostExpensive));
//        books.stream().min(Comparator.comparingDouble(book -> book.getPrice())).ifPresent(book -> System.out.println("Cheapest book: " + book));
//        System.out.println(books.stream().anyMatch(book -> book.getQuantity() > 1000));

    }
}