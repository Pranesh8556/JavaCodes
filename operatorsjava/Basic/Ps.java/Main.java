//Q20.Write a Java Program to print pass/fail result based on marks.


import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((n >=35)? "pass" : "fail");
    }
}
