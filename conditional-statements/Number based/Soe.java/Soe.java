//Q10.Java Program to check whether the sum of two numbers is even or odd

import java.util.*;
public class Soe{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        if(sum%2==0)
        System.out.println("Even");
        else
        System.out.println("Odd");
    }
}