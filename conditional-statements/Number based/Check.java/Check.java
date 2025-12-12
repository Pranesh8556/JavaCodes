//Q18. Java Program to check whether a number is a single-digit, two-digit, or three-digit number

import java.util.*;
public class Check{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((a>-9) && (a<9))
        System.out.println("single-digit");
        else if((a>-99) && (a<99))
        System.out.println("two-digit");
        else if((a>-999) && (a<999))
        System.out.println("three-digit");
        else
        System.out.println("Invalid input");
    }
}