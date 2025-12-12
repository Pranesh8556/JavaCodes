//Q13.Write a Java Program to find Surface Area and Volume of a Cuboid
import java.util.*;
public class Cuboid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();

        double surfaceArea = 2 * (l*b + b*h + l*h);
        double volume = l * b * h;

        System.out.println(surfaceArea);
        System.out.println(volume);
    }
}
