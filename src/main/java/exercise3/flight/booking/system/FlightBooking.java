package exercise3.flight.booking.system;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class FlightBooking {
   private  final String flightNumber = "999";
   private  final String flightCompany = "Flights-of-Fancy";
   private String flightID;
   private String passengerFullName;
   private final String tripSource ="NANJING";
   private final String sourceAirport="NANJING LUKOU INTERNATIONAL AIRPORT";
   private final String tripDestination="OULU";
   private final String destinationAirport="OULU AIRPORT";
   private double departingTicketPrice;
   private double returnTicketPrice;
   private double totalTicketPrice;
   private String ticketNumber;
   private LocalDate departureDate;
   private LocalDate returnDate;
   private int childPassengers;
   private int adultPassengers;
   private int totalPassengers;
   public FlightBooking(String passengerFullName,LocalDate depart,LocalDate returnDate,int childPassengers, int adultPassengers){
      this.passengerFullName = passengerFullName;
      this.departureDate = depart;
      this.returnDate = returnDate;
      this.childPassengers = childPassengers;
      this.adultPassengers = adultPassengers;
      setTotalPassengers(childPassengers,adultPassengers);
      setTicketNumber();
      setFlightID();
   }





   public String getPassengerFullName() {
      return passengerFullName;
   }

   public void setDepartingTicketPrice(double departingTicketPrice) {
      this.departingTicketPrice = departingTicketPrice;
   }

   public void setReturnTicketPrice(double returnTicketPrice) {
      this.returnTicketPrice = returnTicketPrice;
   }

   private void setTicketNumber() {
      int personNumber = (int)((Math.random()+1)*1000000000);
      this.ticketNumber = flightNumber+String.valueOf(personNumber);
   }

   public String getTicketNumber() {
      return ticketNumber;
   }

   public int getChildrenPassengers() {
      return childPassengers;
   }

   public int getAdultPassengers() {
      return adultPassengers;
   }

   public int getTotalPassengers() {
      return totalPassengers;
   }

   public String getFlightID() {
      return flightID;
   }

   public String getTripSource() {
      return tripSource;
   }

   public String getSourceAirport() {
      return sourceAirport;
   }

   public LocalDate getDepartingDate() {
      return departureDate;
   }


   public LocalDate getReturnDate() {
      return returnDate;
   }

   public String getTripDestination() {
      return tripDestination;
   }

   public String getDestinationAirport() {
      return destinationAirport;
   }

   public double getDepartingTicketPrice() {
      return departingTicketPrice;
   }

   public double getReturnTicketPrice() {
      return returnTicketPrice;
   }

   public double getTotalTicketPrice() {
      this.totalTicketPrice = departingTicketPrice + returnTicketPrice;
      return totalTicketPrice;
   }

   public int getChildPassengers() {
      return childPassengers;
   }

   public String getFlightCompany() {
      return flightCompany;
   }

   public LocalDate getDepartureDate() {
      return departureDate;
   }

   public void setTotalPassengers(int childPassengers,int  adultPassengers) {
      this.totalPassengers = adultPassengers+childPassengers;
   }
   public String toString(){
      return "Dear "+passengerFullName+". Thank you for booking your flight with "+flightCompany+".\nFollowing are the details of your booking and the trip:\nTicket Number: "+ticketNumber+"\nFrom "+tripSource+" to "+tripDestination+"\nDate of departure: "+departureDate+"\nDate of return: "+ returnDate+"\nTotal passengers: "+totalPassengers+"\nTotal ticket price in Euros: "+totalTicketPrice;
   }
   /*private char getRandomCapital(){
      Random random = new Random();
      return (char)((random.nextInt(26) + 65));
   }*/

   public void setFlightID() {
     /* String chars = null;
      for (int i=0;i<5;i++){
         char c = getRandomCapital();
         chars = chars + String.valueOf(c);
      }*/
      int midNumber = (int)((Math.random()+1)*1000);
      /*String flightID = chars.indexOf(0)+chars.indexOf(1)+chars.indexOf(2)+String.valueOf(midNumber)+chars.indexOf(3)+chars.indexOf(4);
      this.flightID = flightID;*/
      String flightID = "FOF"+String.valueOf(midNumber)+"IN";
      this.flightID=flightID;
   }
}
