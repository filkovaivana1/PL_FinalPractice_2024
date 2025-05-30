import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    public static Guest createGuest(String firstName, String lastName, String passportNumber) {
        Guest newGuest = new Guest();
        newGuest.setFirstName(firstName);
        newGuest.setLastName(lastName);
        newGuest.setPassportNumber(passportNumber);
        return newGuest;

    }

    public static Reservation createReservation(String reservationCode, LocalDate checkInDate, LocalDate checkOutDate, String roomType) {
        Reservation newReservation = new Reservation();
        newReservation.setReservationCode(reservationCode);
        newReservation.setCheckInDate(checkInDate);
        newReservation.setCheckOutDate(checkOutDate);
        newReservation.setRoomType(roomType);
        return newReservation;


    }



    public static void displayGuestInfo(Guest guest) {
        System.out.println("Guest details:");
        System.out.println("First name: " + guest.getFirstName());
        System.out.println("Last name: " + guest.getLastName());
        System.out.println("Guest passport number: " + guest.getPassportNumber());
        System.out.println(" ");
    }

    public static void displayReservationInfo(Reservation reservation) {
        System.out.println("Reservation details:");
        System.out.println("Reservation code: " + reservation.getReservationCode());
        System.out.println("Check in date: " + reservation.getCheckInDate());
        System.out.println("Check out date: " + reservation.getCheckOutDate());
        System.out.println("Room type: " + reservation.getRoomType());
        System.out.println("Guests: " + reservation.getGuests());
        System.out.println(" ");
    }

    public static List<Guest> findGuestsInReservation(Reservation reservation, String lastName) {

        System.out.println("Guests: " + reservation.getGuests());
        System.out.println(" ");

        List<Guest> filteredGuests = reservation.getGuests().stream().filter(guest -> guest.getLastName().equalsIgnoreCase(lastName)).collect(Collectors.toList());

        return filteredGuests;
    }

    public static void addGuestToReservation(Reservation reservation, Guest guest) {
        System.out.println("Adding guest to reservation:");

        Random random = new Random();
        ArrayList<Guest> randomGuests = new ArrayList<>(new Random().nextInt(5) + 2);
        reservation.setGuests(randomGuests);
        for(int i=0;i<randomGuests.size();i++)
        {
            Guest newguest = new Guest(guest.getFirstName(), guest.getLastName(), guest.getPassportNumber());
            randomGuests.add(newguest);
        }

        reservation.getGuests().add(guest);
        System.out.println(" ");
    }

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Petar Stojanovski");
        names.add("Ana Markovska");
        names.add("Dimitar Volčeski");
        names.add("Elena Dimova");
        names.add("Nikola Trajkovski");
        names.add("Drita Hoxha");
        names.add("Jovan Ristovski");
        names.add("Marija Nikolovska");
        names.add("Aleksandar Mitrevski");
        names.add("Ivana Petrovska");
        names.add("Mihail Kolevski");
        names.add("Maja Stefanovska");
        names.add("Dario Andonovski");
        names.add("Hristina Mitrevska");
        names.add("Andrej Gjorgjievski");
        names.add("Sofija Jovanovska");
        names.add("Alban Veseli");
        names.add("Bisera Trajkovska");
        names.add("Viktor Markovski");
        names.add("Monika Dimitrovska");

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        ArrayList<Guest> guests = (ArrayList<Guest>) names.stream().map(name -> createGuest(name.split(" ")[0], name.split(" ")[1], "PB" + Integer.toString(new Random().nextInt(1000000)))).collect(Collectors.toList());
        guests.stream().forEach(guest -> displayGuestInfo(guest));

        ArrayList<Reservation> reservations = new ArrayList<>(3);
        Reservation reservation1 = createReservation("AB1", LocalDate.of( 2018 , Month.DECEMBER , 25 ), LocalDate.of( 2019 , Month.JANUARY, 25 ), "First");
        Reservation reservation2 = createReservation("AB2", LocalDate.of( 2020 , Month.MAY , 13 ), LocalDate.of( 2019 , Month.JUNE, 20 ), "Second");
        Reservation reservation3 = createReservation("AB3", LocalDate.of( 2022 , Month.JUNE , 20 ), LocalDate.of( 2022 , Month.JUNE, 25 ), "Third");
        reservations.add(reservation1);
        reservations.add(reservation2);
        reservations.add(reservation3);
        reservations.stream().forEach(reservation -> displayReservationInfo(reservation));
        reservations.stream().forEach(reservation -> { String name = names.get(new Random().nextInt(names.size()-1)); addGuestToReservation(reservation, createGuest(name.split(" ")[0], name.split(" ")[1], "PB" + Integer.toString(new Random().nextInt(1000000))));});


        System.out.println("Enter last name to search:");

        try {
            String lastName = bufferedReader.readLine();

        System.out.println("The patients whose last names match " + lastName + " are:");
        reservations.stream().forEach(reservation -> {
            System.out.println("Reservation: " + reservation.getReservationCode()); List<Guest> result = findGuestsInReservation(reservation, lastName);
            result.forEach(guest -> displayGuestInfo(guest));
        });

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

}

}