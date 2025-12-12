//Q3.Java Program to check whether the first two digits and last two digits of a year are equal.

import java.util.*;
public class Ldfd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        int fd=year/100;
        int ld=year%100;
        if(fd==ld)
            System.out.println("Equal");
        else
            System.out.println("Not equal");
    }
}