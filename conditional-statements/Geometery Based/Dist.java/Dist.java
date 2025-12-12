//Q7. Java Program to calculate the distance between two points (x1,y1) and (x2,y2).

import java.util.*;
public class Dist {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        double dist = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));

        System.out.println(dist);
    }
}

