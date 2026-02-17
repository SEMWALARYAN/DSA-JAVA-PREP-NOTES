package a_Basic;
import java.util.Scanner;
//Write a program to print whether a number is even or odd, also take input from the user.
public class a2_question1 {
    public static void main(String[] args){
        //creating a scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = sc.nextInt();
        if(number % 2 == 0){
            System.out.println(number + " is even");
        }else{
            System.out.println(number + " is odd");
        }

    }
}

