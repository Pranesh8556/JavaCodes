//Q5.Write a Java Program to check whether a given year and month combination is valid and print the number of days in that month (consider leap years for February).

import java.util.*;
public class Ym{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int month = sc.nextInt();

        if(year > 0 && month >= 1 && month <= 12){

            boolean leap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
            
            if(month == 2){
                if(leap)
                    System.out.println("29 days");
                else
                    System.out.println("28 days");
            }
            else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
                System.out.println("31 days");
            }
            else{
                System.out.println("30 days");
            }
        }
        else{
            System.out.println("Invalid year or month");
        }
    }
}
