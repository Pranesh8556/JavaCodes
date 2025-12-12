import java.util.*;
public class MangoOffer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int price = sc.nextInt();     // price of 1 mango
        int buy = sc.nextInt();       // mangoes purchased

        int free = buy / 3;           // 1 free for every 3 bought
        int totalMangoes = buy + free;
        int amount = buy * price;     // free mangoes cost = 0

        System.out.println("Total Mangoes: " + totalMangoes);
        System.out.println("Amount: " + amount);
    }
}
