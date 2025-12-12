//Q5. Java Program to check whether two characters are equal or not

import java.util.*;
public class Cha{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        if(ch1==ch2)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
