//ATM

import java.util.*;
public class ATM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int n2 = a / 2000;
        a = a % 2000;

        int n5 = a / 500;
        a = a % 500;

        int n1 = a / 100;

        System.out.println(n2 + " " + n5 + " " + n1);
    }
}
