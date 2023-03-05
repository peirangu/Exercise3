package exercise3.flight.booking.system;


import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dear passenger please input the following messages");
        System.out.println("Your FullName :");
        String passengerFullName = scanner.nextLine();
        System.out.println("The time you depart (in the form yyyy-mm-dd) :");
        String departString = scanner.nextLine();
        LocalDate depart = LocalDate.parse(departString);
        System.out.println("The time you return (in the form yyyy-mm-dd) :");
        String returnString = scanner.nextLine();
        LocalDate returnDate = LocalDate.parse(returnString);
        System.out.println("ChildrenPassengers:");
        int childrenPassengers = scanner.nextInt();
        System.out.println("AdultPassengers: ");
        int adultPassengers = scanner.nextInt();
        FlightBooking flightBooking = new FlightBooking(passengerFullName,depart,returnDate,childrenPassengers,adultPassengers);

      System.out.println(flightBooking);

    }
}
