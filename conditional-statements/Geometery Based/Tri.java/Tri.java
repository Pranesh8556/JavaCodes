//Q1. Java Program to check whether a triangle is equilateral, isosceles, or scalene

import java.util.*;
public class Tri{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a == b && b == c)
            System.out.println("Equilateral");
        else if(a == b || b == c || a == c)
            System.out.println("Isosceles");
        else
            System.out.println("Scalene");
    }
}
