//Q5.Java Program to find whether the given number is 3 digit number or not

import java.util.*;
public class Td{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       if(a>100 && a<999)
        System.out.println("Yes");
        else
        System.out.println("No");
     
    }
}