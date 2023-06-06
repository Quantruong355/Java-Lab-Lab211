/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j1.s.p0060;

/**
 *
 * @author Acer
 */
public class J1SP0060 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        InputValidate iv = new InputValidate();
        Person p = new Person();
        int[] bill = iv.inputBill();
        p.setMoney(iv.inputWallet()); 
        int total = iv.calcTotal(bill);
        iv.payMoney(total, p.getMoney());  
    }
    
}
