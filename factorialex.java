import java.util.Scanner;

public class factorialex {

    public static void main(String[] args) {
        System.out.println("Welcome to Factorial Assignment");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        int fact=1;
        for (int i=1;i<=num;i++)
        {
             fact = fact*i;
        }
        System.out.println("Factorial of the above number is: "+fact );

        }
    }


