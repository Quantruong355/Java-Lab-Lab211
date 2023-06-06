/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j1.s.p0060;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class InputValidate {
    public Scanner sc = new Scanner(System.in);
    
    public int checkInput(){
        while(true){
            try{
                 int a = Integer.parseInt(sc.nextLine());
                 if(a > 0){
                     return a;
                 }else{
                     System.out.println("Number must > 0");
                 }
            }catch(NumberFormatException e){
                System.out.println("Invalid !!");
            }
           
        }
    }
    
    
    
    public int inputWallet(){
        System.out.println("input value of wallet: ");
        int w = checkInput();
        return w;
    }
    
    public int[] inputBill(){
        System.out.println("input number of bill: ");
        int n = checkInput();
        int[] bill = new int[n];
        for(int i = 0; i < bill.length ; i++){
            System.out.println("input value of bill " + (i + 1) + ":");
            bill[i] = checkInput();
        }
        return bill;
    }
     public int calcTotal (int [] bills){
        int total = 0;
        for(int i = 0; i < bills.length; i ++){
            total += bills[i];
        }
        System.out.println("This is total of bill: " + total);
        return total;
        
    }
    
    public boolean payMoney (int total,int money){
        if(total < money){
            System.out.println("You can buy it");
            return true;
        }
        System.out.println("You can buy it");
        return false; 
    }
}
