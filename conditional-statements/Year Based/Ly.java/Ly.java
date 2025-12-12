//Q1. Java Program to check whether a year is a leap year or not

import java.util.*;
public class Ly{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
        System.out.println("Leap year");
        else
        System.out.println("Not Leap year");
    }
}