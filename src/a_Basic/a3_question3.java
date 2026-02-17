package a_Basic;
import java.util.Scanner;
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

public class a3_question3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter p");
        int p = sc.nextInt();
        System.out.println("enter r");
        int r = sc.nextInt();
        System.out.println("Enter t");
        int t = sc.nextInt();
        int SI = (p*r*t)/100;
        System.out.println("SI= " + SI);

    }
}
