//Q1. Java Program to check whether a given character is a vowel or consonant

import java.util.*;
public class Vc{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        a = Character.toLowerCase(a);   

        if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }
}
