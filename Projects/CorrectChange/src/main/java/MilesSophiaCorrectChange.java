
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s.miles1313
 */

//Write a program to calculate change. It should take user input for the total 
//cost and total amount paid (in cents),calculate the change that is due (in 
//cents) and print out that amount as dollars, quarters, dimes, nickels, and 
//pennies. Use integers for all variables and all arithmetic. Remember to use 
//auxillary methods outside of the main() method as often as possible. 

public class MilesSophiaCorrectChange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner numberScan = new Scanner(System.in);
        System.out.println("Please input the total cost in cents.");
        int totalCost = numberScan.nextInt();
        System.out.println("Your total cost is: " + totalCost);
        
        System.out.println("Please input the total amount paid in cents.");
        int totalPaid = numberScan.nextInt();
        System.out.println("Your total amount paid is: " + totalPaid);
        
        int cents = totalPaid - totalCost;
        System.out.println("Your total change is: " + cents);
        System.out.println("Your dollar change is: " + dollars(cents));
        System.out.println("Your quarter change is: " + quarters(cents));
        System.out.println("Your dime change is: " + dimes(cents));
        System.out.println("Your nickel change is: " + nickels(cents));
        System.out.println("Your penny change is: " + pennies(cents));

    }
    
    public static int dollars(int cents){
        return cents/100;
    }
    
    public static int quarters(int cents){
        int qCents = cents % 100;
        return qCents/25;
    }
    
    public static int dimes(int cents){
        int dCents = (cents % 100) % 25;
        return dCents/10;
    }
    
    public static int nickels(int cents){
        int nCents = ((cents % 100) % 25) % 10;
        return nCents/5;
        
    }
    
    public static int pennies(int cents){
        int pCents = (((cents % 100) % 25) % 10) % 5;
        return pCents;
    }
    
}
