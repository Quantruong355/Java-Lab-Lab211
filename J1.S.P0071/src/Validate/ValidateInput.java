/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validate;

import Model.Task;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class ValidateInput {
    Scanner sc = new Scanner(System.in);
     ArrayList<Task> list = new ArrayList<>();
    public int checkChoice(){
        int choice = 0;
        while(true){
            try{
                System.out.print("Input option: ");
                choice = Integer.parseInt(sc.nextLine());
                if(choice >= 1 && choice <=4){
                    break;
                }else{
                    System.out.println("Choice must be [1,4] !!");
                }
            }catch(Exception e){
                System.out.println("Invalid!! Input again !!");
            }
        }
        return choice;
    }
    
    
    public String getName(){
        String name;
        String rex = "[a-zA-Z]+";
        while(true){
            try{
                System.out.print("Requirement Name: ");
                name = sc.nextLine();
                if( name != null && name.matches(rex)){
                    break;
                }
                System.out.println("Name cannot be null or number !!");
            }catch(Exception e){
                System.out.println("Invalid Name !!");
            }
        }
        return name;
    }
    
    public int checkTaskType(){
        int a;
        while(true){
            try{
                System.out.print("Task Type: "); 
                a = Integer.parseInt(sc.nextLine());
                if(a >= 1 && a <= 4){
                    break;
                }else{
                    System.out.println("Must be [1,4]");
                }
            }catch(Exception e){
                System.out.println("Invalid !!");
            }
        }
        return a;
    }
    
    public String checkDate(){
        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
        sd.setLenient(false);
        Date date;
        while(true){
            try{
                System.out.print("Date: ");
                 date = sd.parse(sc.nextLine());
                 break;
            }catch(Exception e ){
                System.out.println("Invalid date !!s");
            }
        }
        return sd.format(date);
        
    }
    
    public double checkFrom(){
        double a;
        while(true){
            try{
            System.out.print("From: ");
            a = Double.parseDouble(sc.nextLine());
            if(a >= 8 && a<= 17 && a % 0.5 == 0){
                break;
            }else{
                System.out.println("Must be [8.0,17.0]");
            }
        }catch(Exception e){
                System.out.println("Invalid number");
                }
    }
        return a;
}
    
        public double checkTo(double from){
        double b;
        while(true){
            try{
            System.out.print("To: ");
            b = Double.parseDouble(sc.nextLine());
            if(b >= 8.5 && b <= 17.5 && b % 0.5 == 0 && b > from ){
                break;
            }else{
                System.out.println("Must be [8.5,17.5] and > From");
            }
        }catch(Exception e){
                System.out.println("Invalid number");
                }
    }
        return b;
}
        
         public String checkAssignee(){
             String rex = "[a-zA-Z]+";
             String assignee;
        while(true){
            try{
                System.out.print("Assignee: ");
                assignee = sc.nextLine();
                if( assignee != null && assignee.matches(rex)){
                    break;
                   
                }
                 System.out.println("Cannot be null or number !!");
            }catch(Exception e){
                System.out.println("Invalid !!");
            }
        }
        return assignee;
    }
         
          public String checkReviewer(){
              String rex = "[a-zA-Z]+";
              String rver;
        while(true){
            try{
                System.out.print("Reviewer: ");
                 rver = sc.nextLine();
                if( rver != null && rver.matches(rex)){
                    break;
                }
                System.out.println("Cannot be null or number !!");
            }catch(Exception e){
                System.out.println("Invalid !!");
            }
        }
        return rver;
    }
          
          public int checkId(){
         int id;
        while(true){
            try{
            System.out.print("ID: ");
            id = Integer.parseInt(sc.nextLine());
            if(id > 0){
                break;
            }else{
                System.out.println("Must be > 0");
            }
        }catch(Exception e){
                System.out.println("Invalid number");
                }
    }
        return id;
}
   
          public boolean checkTaskExist(ArrayList<Task> list,String date, double from,double to, String assign) {
        //check from first to last list doctor
        for (Task t : list) {
            if(date.equalsIgnoreCase(t.getDate()) && assign.equalsIgnoreCase(t.getAssignee())){
              if (from == t.getFrom()){
                return false;
            }else if( from > t.getFrom() && from < t.getTo()){
                return false;
            }else if(from  < t.getFrom() && to > t.getFrom()){
                return false;
            }  
            }
        }
        return true;
    }
}
