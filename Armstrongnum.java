import java.sql.SQLOutput;
import java.util.Scanner;

public class Armstrongnum {
    public static void main(String[] args) {
        System.out.println("Welcome to Assignment 2!!");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check whether its Armstrong or not");
        int num = scan.nextInt();
        int num1=num;
        int temp;
        int len = String.valueOf(num1).length();
        System.out.println(len);
        int sum =0;
        while (num != 0) {
            temp = num % 10;
            sum += (Math.pow(temp,len));
            num = num / 10;
        }
        if (sum == num1)
        {
            System.out.println(num1 + " Is armstrong num");}

        else
        {
            System.out.println(num1  +" Is not an armstrong num");

        }
    }
    }


