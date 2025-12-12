//Q16. Java Program to check whether a number is divisible by both 2 and 5 but not by 8.

import java.util.*;
public class Dtfe{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((((a%2)==0) && ((a%5)==0)) && ((a%8!=0)) )
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}