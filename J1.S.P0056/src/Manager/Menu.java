/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manager;

import Model.SalaryHistory;
import Model.Worker;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Acer
 */
public class Menu {
    ArrayList<Worker> list = new ArrayList<>();
    ArrayList<SalaryHistory> listh = new ArrayList<>();
    Validation.ValidateInput val = new Validation.ValidateInput();
     public void MenuOption(){
          System.out.println("1. Add Worker");
         System.out.println("2. Up Slary");
         System.out.println("3. Down Salary");
         System.out.println("4. Display information salary");
         System.out.println("5. Exit");
     }
     
   public void addWorker(String id, String name, int age, double salary, String workLocation){     
                    if(val.checkCodeExist(list, id)){
                        Worker w = new Worker(id, name, age, salary, workLocation);
                        list.add(w);
                    System.out.println("Add successful !!");
                    System.out.println();   
                    return;
             }else{
                        System.out.println(" Duplicated !!");
                        System.out.println();
                    }     
}
   
   public String getCurrentDate(){
       SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
       Date current = new Date();
       return dateformat.format(current);
   }

   public void changeSalary(String id,int mode){
       double update = 0;
       for(Worker w : list){
           if(!id.equalsIgnoreCase(w.getId())){
               System.out.println("Code not found !!");
               System.out.println();
               return;
           }
           while(true){
               double salary = val.checkSalary();
           if(mode == 1 ){
               update = w.getSalary() + salary; 
               w.setSalary(update); 
               listh.add(new SalaryHistory(w.getId(), w.getName(), w.getAge(), 
                       update, w.getWorkLocation(), "UP", getCurrentDate()));
           System.out.println("Increase success !!");
           System.out.println();
           return;
           }else if(mode == 2){
               if(w.getSalary() > salary){
                  update = w.getSalary() - salary;  
                  w.setSalary(update); 
                  listh.add(new SalaryHistory(w.getId(), w.getName(), w.getAge(), 
                       update, w.getWorkLocation(), "DOWN", getCurrentDate()));
                   System.out.println("Decrease success !!");
               System.out.println();
                 return;
               }else{
                   System.out.println("Must be < current salary ");
               }
           }           
           }  
       }
       
   }
   
   
public void displayHistory(){
    if(listh.isEmpty()){
        System.out.println("List is emty !!");
        System.out.println();
        return;
      }
    System.out.println("------------------------------ Display Information Salary ------------------------------");
    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n","Code","Name","Age","Salary","Status","Date");
         for(SalaryHistory sh : listh){
             System.out.println(sh);
         }
         System.out.println();
     }   
}
