//Q12. Java Program to check whether the last digit of a number is odd or even

import java.util.*;
public class Ldoe{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int fd=a%10;
        System.out.println(fd);
        if(fd%2==0)
        System.out.println("Even");
        else
        System.out.println("Odd");
    }
}