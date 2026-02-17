package a_Basic;
import java.util.Scanner;
//Take name as input and print a greeting message for that particular name.
public class a3_question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name :");
        String name = sc.nextLine();

        System.out.println("Hello " + name +" dear friend");
    }
}
