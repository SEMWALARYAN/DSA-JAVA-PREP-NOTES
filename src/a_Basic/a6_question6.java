package a_Basic;
import java.util.Scanner;
//Input currency in rupees and output in USD.
public class a6_question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the amount in inr");
        float inr = sc.nextFloat();
        double  var = 90.63;
        double  usd = inr / var;
        System.out.println("inr to usd for your amount is: " + usd +" dollars");
    }
}
