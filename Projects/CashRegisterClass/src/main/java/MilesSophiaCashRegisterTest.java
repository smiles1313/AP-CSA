/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s.miles1313
 */
public class MilesSophiaCashRegisterTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MilesSophiaCashRegister register2 = new MilesSophiaCashRegister(7.5);

        register2.addItem(3.95, false);
        register2.addItem(19.95, true);

        System.out.println(register2.getCount());
        System.out.println("Expected: 2");
        
        System.out.printf("%.2f\n", register2.getTotal());
        System.out.println("Expected: 25.40");
    }

}
