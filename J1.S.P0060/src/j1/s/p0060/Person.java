/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j1.s.p0060;

/**
 *
 * @author Acer
 */
public class Person {
    private Wallet wallet = new Wallet();

    public int getMoney(){
        return wallet.getMoney();
    }
   
    public void setMoney(int i){
        wallet.setMoney(i);
    }
}
