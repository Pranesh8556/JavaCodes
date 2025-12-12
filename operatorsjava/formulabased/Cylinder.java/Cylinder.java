//Q15.Write a Java Program to find Surface Area and Volume of a Cylinder

import java.util.*;
public class Cylinder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double h = sc.nextDouble();

        double surfaceArea = 2 * Math.PI * r * (r + h);
        double volume = Math.PI * r * r * h;

        System.out.println(surfaceArea);
        System.out.println(volume);
    }
}
