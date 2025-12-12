//Q17.Write a Java program to assign different ticket prices based on day of the week (weekday/weekend).

import java.util.*;
public class TicketDay {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String day = sc.next().toLowerCase(); 

        int price = 0;

        switch(day){
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                price = 100;  
                break;

            case "saturday":
            case "sunday":
                price = 150;  
                break;

            default:
                System.out.println("Invalid Day");
                return;
        }

        System.out.println(price);
    }
}
