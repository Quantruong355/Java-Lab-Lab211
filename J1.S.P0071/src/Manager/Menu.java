/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manager;

import Model.Task;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class Menu {
        ArrayList<Task> list = new ArrayList<>();
       
        Validate.ValidateInput val = new Validate.ValidateInput();
     public void MenuOption(){
         System.out.println("1. Add task");
         System.out.println("2. Delete task");
         System.out.println("3. Display task");
         System.out.println("4. Exit");
     }
     
     public void getDataTask(){
         System.out.println("----------------------------------------- Task ---------------------------------------");
           System.out.printf("%-5s%-10s%-20s%-10s%10s%20s%20s\n","ID","Name","Task Type","Date","Time","Assignee","Reviewer");
         for(Task t : list){
             System.out.println(t);
         }
         System.out.println();
     }
     
     public void addTask(){     
         while(true){
                 int id = 0;
                    if(!list.isEmpty()){
                        id = list.get(list.size()-1).getId()+ 1;
                    }
                    String name = val.getName();
                    int tasktype = val.checkTaskType();
                    String date = val.checkDate();
                    double from = val.checkFrom();
                    double to = val.checkTo(from);
                    String assignee = val.checkAssignee();
                    String reviewer = val.checkReviewer();
                    if(val.checkTaskExist(list,date,from ,to,assignee)){
                        Task t = new Task(id, name, tasktype, date, from, to, assignee, reviewer);
                        list.add(t);
                    System.out.println("Add successful !!");
                    System.out.println();   
                    return;
             }else{
                        System.out.println("Task is duplicated !!");
                        System.out.println();
                    }
           
         }
                    
         
}
     
     public void deleteTask(){
         System.out.println("----------Del Task-------");
         int id = val.checkId();
         while(true){
         for(Task t : list){
             if(id == t.getId()){
                 list.remove(t);
                 System.out.println("Delete successful!!");
                 System.out.println();
                 return;
             }else{
                 System.out.println("Id not found!!");
             }
          
         }
     }
}
}
