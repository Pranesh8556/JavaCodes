//Q11.Java Q11.Write a Java Program to print the middle digit of a 3-digit number.

import java.util.*;
public class Mtd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(); 
        int b=a/10;
        int c=b%10;
        System.out.println(c);
    
}
}