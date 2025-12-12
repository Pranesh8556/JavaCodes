//Q14.Write a Java program to assign ticket price based on passenger age (child, adult, senior).

import java.util.*;
public class TicketPrice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        int price = 0;

        if(age < 12)
            price = 50;       
        else if(age <= 59)
            price = 100;      
        else
            price = 70;       

        System.out.println(price);
    }
}
