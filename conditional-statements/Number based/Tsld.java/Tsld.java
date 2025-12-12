//Q17. Java Program to check whether two numbers have the same last digit

import java.util.*;
public class Tsld{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a%10;
        int d=b%10;
        if(c==d)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}