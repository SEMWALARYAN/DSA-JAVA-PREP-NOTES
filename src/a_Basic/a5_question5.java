package a_Basic;
import java.util.Scanner;
//Take 2 numbers as input and print the largest number.
public class a5_question5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        if(num1>num2){
            System.out.println("num1 is greater than second number");
        }else{
            System.out.println("num2 is greater than first number");
        }
    }

}
