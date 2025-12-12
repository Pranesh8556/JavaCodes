//Q4.Java Program to find whether the difference between two numbers is even or odd

import java.util.*;
public class Oe{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int d=Math.abs(a);
        int e=Math.abs(b);
        int c=d-e;
        System.out.println(c + "\n");
        if(c%2==0)
        System.out.println("Even");
        else
        System.out.println("Odd");

    }
}