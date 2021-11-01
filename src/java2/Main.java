package java2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {

            System.out.println("Room number: ");
            int number = sc.nextInt();
            System.out.println(" Check-in date (dd/MM/yyyy: ");
            Date checkIn = sdf.parse(sc.next());
            System.out.println(" Check- out date (dd/MM/yyyy: ");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println(" Enter data to update the reservation: ");
            System.out.println("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.println(" CheckOut date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println(" Reservation: " + reservation);
        }

        catch(ParseException e) {
            System.out.println("Invalid date format");
        }
        catch(DomainException e){
            System.out.println("Error in reservation: " + e.getMessage());//vai mostrar a mensagem lá do reservation
        }
        catch (RuntimeException e){
            System.out.println("Unexpected error");
        }

    sc.close();


    }


}
