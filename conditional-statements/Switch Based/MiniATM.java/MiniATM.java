//Q5.Java Program using switch to implement a mini ATM simulation

import java.util.*;
public class MiniATM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int balance = 1000; 

        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");

        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("Balance: " + balance);
                break;
            case 2:
                System.out.print("Enter deposit amount: ");
                int deposit = sc.nextInt();
                balance += deposit;
                System.out.println("New Balance: " + balance);
                break;

            case 3:
                System.out.print("Enter withdrawal amount: ");
                int withdraw = sc.nextInt();
                if(withdraw <= balance){
                    balance -= withdraw;
                    System.out.println("New Balance: " + balance);
                } else {
                    System.out.println("Insufficient Balance");
                }
                break;

            case 4:
                System.out.println("Thank you for using ATM");
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}