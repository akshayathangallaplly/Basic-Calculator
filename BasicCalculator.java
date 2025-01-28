import java.util.Scanner;
 
// Driver class
public class BasicCalculator {
    // main function
    public static void main(String[] args)
    {
        // Stores two numbers
        int num1, num2;
 
        // Take input from the user
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter the numbers:");
 
        // Take the inputs
        num1 = sc.nextInt();
        num2 = sc.nextInt();
 
        System.out.println("Enter the operator (+,-,*,/):");
 
        char op = sc.next().charAt(0);
        int a = 0;
 
        switch (op) {
        // case to add two numbers
        case '+':
            a = num1 + num2;
            break;
 
        // case to subtract two numbers
        case '-':
            a = num1 - num2;
            break;
 
        // case to multiply two numbers
        case '*':
            a = num1 * num2;
            break;
 
        // case to divide two numbers
        case '/':
            a = num1 / num2;
            break;
 
        default:
            System.out.println("You enter wrong input");
        }
 
        System.out.println("The final result:");
        System.out.println();
 
        // print the final result
        System.out.println(num1 + " " + op + " " + num2
                           + " = " + a);
    }

        }
    

