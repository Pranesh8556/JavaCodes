//Q10.Write a Java Program to find Perimeter of a Triangle

import java.util.*;
public class TrianglePerimeter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double perimeter = a + b + c;
        System.out.println(perimeter);
    }
}
