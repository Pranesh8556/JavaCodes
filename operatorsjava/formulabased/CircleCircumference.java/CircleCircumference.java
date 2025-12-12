//Q11.Write a Java Program to find Circumference of a Circle
import java.util.*;
public class CircleCircumference {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double circumference = 2 * Math.PI * r;
        System.out.println(circumference);
    }
}