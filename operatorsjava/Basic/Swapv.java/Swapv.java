// Q7.Write a Java Program to Swap of two numbers without using third variable

import java.util.*;
public class Swapv{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(); //10
        int b=sc.nextInt();//5
        a=a+b;//15
        b=a-b; //15-10=5
        a=a-b;
        System.out.println(a+" "+b);
    
}
}