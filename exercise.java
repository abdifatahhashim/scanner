package userInput;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = Scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = Scanner.nextInt();
        System.out.println(num1 + " x " + num2 +" = " +num1 * num2);


//        Input first number: 25
//        Input second number: 5
//        Expected Output :
//        25 x 5 = 125
    }

}
