//Q13. Java Program to check whether a number is positive, negative, or zero

import java.util.*;
public class Pno{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>0)
        System.out.println("Positive");
        else if(a<0)
        System.out.println("Negative");
        else
        System.out.println("Zero");
    }
}