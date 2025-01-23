import java.util.Scanner;

/**
 *Demo exercise to practice printing and reading input from the user
 *
 * @author: Robert Reed
 */
public class PrintandScanner {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Welcome to Swig!");
      System.out.print("What's your name? ");     
      String name = scanner.nextLine();
      System.out.println();
      
      System.out.println("Hi " + name + ", let's take your order.");
      System.out.print("How many drinks would you like? ");
      int drinkcount = scanner.nextInt();
      System.out.print("How many pastries would you like? ");
      int pastrycount = scanner.nextInt();
      System.out.println();
      
      System.out.println("Order Summary:");
      double drinktotal = drinkcount * 2.5;
      double pastrytotal = pastrycount * 4;
      System.out.println(drinkcount + " drink(s) @ $2.50 each - $" + drinktotal);
      System.out.println(pastrycount + " pastry(s) @ $4.00 each - $" + pastrytotal);
      System.out.println();
      System.out.printf("Total: $%.2f %n", drinktotal + pastrytotal);      
   }
}