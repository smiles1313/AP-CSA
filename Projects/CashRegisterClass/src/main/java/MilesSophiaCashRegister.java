/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s.miles1313
 */


//  A simulated cash register that tracks the item count and the total amount due.

public class MilesSophiaCashRegister {
// Instance Variables
    private int itemCount;
    private double totalPrice;
    private double taxableTotal;
    private double taxRate;
    
// Constructor
    public MilesSophiaCashRegister(double aTaxRate) {
        itemCount = 0;
        totalPrice = 0;
        taxRate = aTaxRate;
    }

// Methods
    public void addItem(double price, boolean taxable) {
        itemCount += 1;
        
        if (taxable == true){
            totalPrice += (price * taxRate/100) + price;
            taxableTotal += 1;
        }
        else
            totalPrice += price;
    }

    public double getTotal() {
        return totalPrice;
    }
    
    public int getCount() {
        return itemCount;
    }

    public void clear() {
        itemCount = 0;
        totalPrice = 0;
    }
}

/* 
//Console Output\\

2
Expected: 2
25.40
Expected: 25.40

*/