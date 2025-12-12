//Q2. Java Program to check whether a triangle is right-angled or not

import java.util.*;
public class Ra{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Find the largest side
        int max = Math.max(a, Math.max(b, c));

        int x, y;
        if(max == a){
            x = b; y = c;
        } else if(max == b){
            x = a; y = c;
        } else {
            x = a; y = b;
        }

        if(max*max == x*x + y*y)
            System.out.println("RA");
        else
            System.out.println("Not RA");
    }
}
