//Q11.Write a Java program to apply discount based on purchase amount.

import java.util.*;
public class PurchaseDiscount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double amount = sc.nextDouble();
        double discount = 0;

        if(amount >= 5000)
            discount = amount * 0.20;   
        else if(amount >= 2000)
            discount = amount * 0.10;   
        else if(amount >= 1000)
            discount = amount * 0.05;   

        double finalAmount = amount - discount;

        System.out.println(finalAmount);
    }
}
