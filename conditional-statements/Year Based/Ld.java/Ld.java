//Q4.Java Program to check whether two given years have the same last digit.

import java.util.*;
public class Ld{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int year1=sc.nextInt();
        int year2=sc.nextInt();
        int fd=year1%10;
        int ld=year1%10;
        if(fd==ld)
            System.out.println("Equal");
        else
            System.out.println("Not equal");
    }
}