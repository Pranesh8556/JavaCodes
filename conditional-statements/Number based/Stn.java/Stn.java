//Q2.Java Program to find smallest among two numbers

import java.util.*;
public class Stn{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a<b)
        System.out.println("smallest is: " + a);
        else
        System.out.println("smallest is: " + b);

    }
}