//Q10.Write a Java Program to print the sum of the first and last digit of a 3-digit number.

import java.util.*;
public class Sumfld{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();  //346
        int b=a%10; //6
        int d=a/100; //3
        int c=b+d;
        System.out.println(c);
    
}
}