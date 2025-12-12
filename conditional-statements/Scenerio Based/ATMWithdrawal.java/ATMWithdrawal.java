//Q9.Write a Java program to check if withdrawal amount ≤ balance and is a multiple of 100 (ATM Withdrawal Validation).

import java.util.*;
public class ATMWithdrawal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int balance = 5000;      // current balance
        int withdraw = sc.nextInt();

        if(withdraw <= balance && withdraw % 100 == 0)
            System.out.println("Withdrawal Successful");
        else
            System.out.println("Invalid Withdrawal");
    }
}
