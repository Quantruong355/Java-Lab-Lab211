/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manager;

import Model.Expense;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Acer
 */
public class Menu {
     ArrayList<Expense> list = new ArrayList<>();
       
        Validation.ValidateInput val = new Validation.ValidateInput();
     public void MenuOption(){
          System.out.println("1. Add Expense");
         System.out.println("2. Display Expense");
         System.out.println("3. Delete Expense");
         System.out.println("4. Exit");
     }
     
     
    public void addExpense(){     
         while(true){
                 int id = 1;
                    if(!list.isEmpty()){
                        id = list.get(list.size()-1).getId()+ 1;
                    }
                    Date dateinput = val.checkDate();
                    SimpleDateFormat sd = new SimpleDateFormat("dd-MMM-yyyy");
                    String date = sd.format(dateinput);
                    double money = val.checkMoney();
                    String content = val.checkContent();
                    if(val.checkExpenseExist(list, date, money, content)){
                        Expense e = new Expense(id, date, money, content);
                        list.add(e);
                    System.out.println("Add successful !!");
                    System.out.println();   
                    return;
             }else{
                        System.out.println("Expense is duplicated !!");
                        System.out.println();
                    }
           
         }
                    
         
}
    
    public void displayAll(){
        int total = 0;
         System.out.println("----------------------------------------- Expense ---------------------------------------");
           System.out.printf("%-10s%-20s%20s%20s\n","ID","Date","Amount","Content");
         for(Expense e : list){
             System.out.println(e);
             total += e.getNumber();
         }
         System.out.println("Total: " + total);
         System.out.println();
     }
    
    public void deleteExpense(){
          
         System.out.println("----------Del Task-------");
         int id = val.checkId();
         while(true){
         for(Expense e : list){
             if(id == e.getId()){
                 list.remove(e);
                 System.out.println("Delete successful!!");
                 System.out.println();
                 return;
             }
 
         }
         System.out.println("Id not found!!");
             System.out.println();
         return;
     }
}
    }

