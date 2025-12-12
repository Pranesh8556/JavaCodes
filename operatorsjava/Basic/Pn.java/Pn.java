//Q18.Write a Java Program to print whether a number is positive or negative.

import java.util.*;
public class Pn {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println((n >= 0) ? "Positive" : "Negative");
    }
}
