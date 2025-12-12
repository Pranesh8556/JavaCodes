//Q14. Java Program to check whether a number is divisible by both 3 and 5

import java.util.*;
public class Dtf{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(((a%3)==0) && ((a%5)==0))
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}