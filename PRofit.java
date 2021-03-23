import java.util.Scanner;
/*
This Program allows the user to input the price of a Circuit to calculate the profit per unit

@author Michael Soskin
@version 1.0
@date 28-01-2021

 */
public class PRofit {
    public static void main(String[] args) {

        // Local variables. No constructor needed because we are working in main.
        double percentage = .40;
        double price;
        double profit;

        // Instantiate the class Scanner for input from keyboard.
        Scanner myScanner = new Scanner(System.in);

        // sout to user and move variable price to nextline.
        System.out.println("What is the retail price of your circuit board?");
        price = myScanner.nextDouble();

        // Calculation with the input from keyboard.
        profit = price * percentage;

        System.out.println("The price of a circuit is"+" $"+ price +".");
        System.out.println("Your total profit is "+"$"+ profit + " Per Unit.");
    }
}
