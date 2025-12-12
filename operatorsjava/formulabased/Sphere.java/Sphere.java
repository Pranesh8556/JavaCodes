//Q14.Write a Java Program to find Surface Area and Volume of a Sphere

import java.util.*;
public class Sphere {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();

        double surfaceArea = 4 * Math.PI * r * r;
        double volume = (4.0/3) * Math.PI * r * r * r;

        System.out.println(surfaceArea);
        System.out.println(volume);
    }
}
