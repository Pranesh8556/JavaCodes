//Q3. Java Program to check whether a character is alphabet or not

import java.util.*;
public class Alp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
            System.out.println("Yes");
        
        else
            System.out.println("No");
    }
}

