package userInput;
//How to accept user input in Java
import java.util.Random;
import java.util.Scanner;
 class main {
     public static void main(String[] args) {
         Scanner Scanner = new Scanner(System.in);
         String userName;
         // Enter username and press Enter
         System.out.println("What is your Name: ");
         String name = Scanner.nextLine();

         System.out.println("How old are you: ");
         int Age = Scanner.nextInt();

         System.out.println("What is your Salary: ");
         double Salary = Scanner.nextDouble();

         System.out.println("What is your Favourite food: ");
         String Food = Scanner.next();

         System.out.println("hello "+name+"!");
         System.out.println("you are "+Age+"years old");
         System.out.println("you like "+Food);
         System.out.println("Salary: " + Salary);

        // Scanner.nextBoolean();
       //  Scanner.nextByte();
       //  Scanner.nextDouble();
        // Scanner.nextInt();
        // Scanner.nextInt();
        // Scanner.nextLine();
        // Scanner.nextLong();
       //  Scanner.nextShort();



     }
 }


