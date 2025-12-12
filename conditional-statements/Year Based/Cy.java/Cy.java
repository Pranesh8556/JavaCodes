//Q2
import java.util.*;
public class Cy{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();

        if(y % 100 == 0)
            System.out.println("Century Year");
        else
            System.out.println("Not a Century Year");
    }
}
