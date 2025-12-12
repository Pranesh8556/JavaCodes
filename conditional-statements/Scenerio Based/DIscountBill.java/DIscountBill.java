//Q1.Write a Java Program to calculate different discount for different Bill amount

import java.util.*;
public class DiscountBill{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double bill = sc.nextDouble();
        double discount = 0;

        if(bill >= 5000)
            discount = bill * 0.20;   
        else if(bill >= 2000)
            discount = bill * 0.10;   
        else if(bill >= 1000)
            discount = bill * 0.05;   
        else
            discount = 0;              

        double finalAmount = bill - discount;

        System.out.println("Discount: " + discount);
        System.out.println("Final Bill: " + finalAmount);
    }
}

