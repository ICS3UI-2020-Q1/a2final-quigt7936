import java.util.Scanner;
/**
 * This program tells you the price of a pizza.
 * @author Thomas Quigley 
 */
public class Main {


  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // ask and store the diameter of the pizza.
    System.out.println("What is the size of the pizza (in cm):");
    int pizzaDiameter = input.nextInt();

    // declare the variables and constants
    double diameterCost = 0.50 * pizzaDiameter;
    final double LABOUR_COST = 0.75;
    final double OVEN_COST = 0.99;
    final double TAX = 0.13;

    // find the costs
    double subTotal = LABOUR_COST + diameterCost + OVEN_COST;
    double taxTotal = subTotal * TAX;
    double total = subTotal + taxTotal;

    // tell them their costs
    System.out.println("Subtotal: $" + subTotal);
    System.out.println("Taxes: $" + taxTotal);
    System.out.println("Total: $" + total);

    // find out what message we give them, and give it to them
    if (pizzaDiameter >= 1 && pizzaDiameter < 20) {
      System.out.println("We are going to make you a cute little pizza!");
    } else if (pizzaDiameter >= 20 && pizzaDiameter < 40) {
      System.out.println("This will be delicious!");
    } else {
      System.out.println("Whoa, big pizza! You might need a truck to get this home!");
    }
  }
}