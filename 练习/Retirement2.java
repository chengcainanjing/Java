import java.util.*;

/**
 * This program demonstrates a <code>do/while<code/> loop.
 * @version 1.0 2019.10.10
 * @author chengcai
  */

public class Retirement2
{
    public static void main(String[] args) {
        // read input
        Scanner in = new Scanner(System.in);

        System.out.print("How much money will you contribute every year?");
        double payment = in.nextDouble();

        System.out.print("Interest rate in %: ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int year = 0;

        String input;

        // update account balance while user isn't ready to retire
        do {
            //add this year's payment and interest
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;

            year++;

            //print current balance
            System.out.printf("After year %d, your balance is %,.2f%n", year, balance);

            //ask if ready to retire and get input
            System.out.print("Ready to retire?(Y/N)");
            input = in.next();

        }
        //while (input.equals("N"));
        //ignore n/N
        while (input.equalsIgnoreCase("N"));
    }
}