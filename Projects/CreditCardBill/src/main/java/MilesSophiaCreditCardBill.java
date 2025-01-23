/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s.miles1313
 */
import java.util.Scanner;
public class MilesSophiaCreditCardBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //Checks
        System.out.println("Check: owe = $1000, monthly interest percent = 1.5%, payment per month = $100");  //check 1
        System.out.println("Check: owe = $750, monthly interest percent = 0.5%, payment per month = $125");  //check 2
        System.out.println("Check: owe = $1370, monthly interest percent = 2%, payment per month = $250 \n");  //check 3
        //
        
        System.out.println("Enter the beginning balance you owe (in dollars) : ");
        double owe = scan.nextDouble();
        System.out.println("Enter the monthly interest percent (example, 1.5 for 1.5%): ");
        double mInterest = scan.nextDouble();
        mInterest /= 100;  // converts interest percent to a double for later calculations
        System.out.println("Enter the payment amount you will make each month (in dollars): ");
        double mPayment = scan.nextDouble();
        
        //Expects
        System.out.println("\nExpect: time = 11 months, total payment = $1091.62");   //expect 1
        System.out.println("Expect: time = 7 months, total payment = $763.41");   //expect 2
        System.out.println("Expect: time = 6 months, total payment = $1465.81 \n");   //expect 3
        //
        
        paymentCalculator(owe, mInterest, mPayment);
        
    }
    
    public static void paymentCalculator(double o, double i, double p){    // takes in owe, mInterest, and mPayment
        for (int month = 1; o > 0; month++){
            double totalPayments = month * p;   //declares variable so total payments the user payed is displayed in table
            o = (o + (o * (i))) - p;            //calculates the value owed per month minus montly Payment
            
            if (o < 0)  // o at this time would've already been calculated again, so -, but not checked by for loop yet
                        //prints last column in the table, amount needed to pay to reach 0 in debt
                System.out.println("Month: " + month + "\t balance: 0" + "\t total payment: " + (totalPayments + o)); 
            else
                        //prints all of the table, except for the last column
                System.out.println("Month: " + month + "\t balance: " + o + "\t total payment: " + totalPayments);      
        }       
        

    }
    
}
