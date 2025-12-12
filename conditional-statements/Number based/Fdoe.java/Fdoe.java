//Q11. Java Program to check whether the first digit of a 3 digit number is odd or even

import java.util.*;
public class Fdoe{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int fd=a/100;
        System.out.println(fd);
        if(fd%2==0)
        System.out.println("Even");
        else
        System.out.println("Odd");
    }
}