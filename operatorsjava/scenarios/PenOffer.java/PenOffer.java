//pens

import java.util.*;
public class PenOffer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt(); 
        int b = sc.nextInt(); 

        int g = b / 5;        
        int pay = g * 3 + (b % 5);
        int amt = pay * p;

        System.out.println("Pay For: " + pay);
        System.out.println("Total Amount: " + amt);
    }
}
