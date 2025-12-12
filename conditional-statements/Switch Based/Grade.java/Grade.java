//Q2.Java Program to check grade of a student based on marks (A, B, Java, Fail)

import java.util.*;
public class Grade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();

        if(m >= 90 && m <= 100)
            System.out.println("A");
        else if(m >= 75 && m < 90)
            System.out.println("B");
        else if(m >= 50 && m < 75)
            System.out.println("C");
        else
            System.out.println("Fail");
    }
}
