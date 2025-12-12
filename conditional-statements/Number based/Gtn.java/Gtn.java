//Q1.Java Program to find greatest among two numbers

import java.util.*;
public class Gtn{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b)
        System.out.println("Greater is: " + a);
        else
        System.out.println("Greater is: " + b);

    }
}