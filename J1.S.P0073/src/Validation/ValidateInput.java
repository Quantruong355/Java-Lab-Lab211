/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validation;

import Model.Expense;
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
    ArrayList<Expense> list = new ArrayList<>();
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
     
     
        public Date checkDate(){
        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
        sd.setLenient(false);
        Date date;
        while(true){
            try{
                System.out.print("Date: ");
                 date = sd.parse(sc.nextLine());
                 Date now = new Date();
                 if(date.after(now)){
                     System.out.println("Cannot after current date !!");
                     continue;
                 }
                 break;
            }catch(Exception e ){
                System.out.println("Invalid date !!s");
            }
        }
        return date;
        
    }
        
        public double checkMoney(){
        double a;
        while(true){
            try{
            System.out.print("Enter amount: ");
            a = Double.parseDouble(sc.nextLine());
            if(a >  0){
                break;
            }else{
                System.out.println("Must be > 0");
            }
        }catch(Exception e){
                System.out.println("Invalid number");
                }
    }
        return a;
}
        
        public String checkContent(){
        String name;
        String rex = "[a-zA-Z]+";
        while(true){
            try{
                System.out.print("Enter Content: ");
                name = sc.nextLine();
                if( name != null && name.matches(rex)){
                    break;
                }
                System.out.println("Cannot be null or number !!");
            }catch(Exception e){
                System.out.println("Invalid !!");
            }
        }
        return name;
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
        
        public boolean checkExpenseExist(ArrayList<Expense> list, String date, double number, String content) {
        //check from first to last list doctor
        for (Expense e : list) {
            if (date.equalsIgnoreCase(e.getDate()) && date.equalsIgnoreCase(e.getDate()) 
                    && number == e.getNumber() && content.equalsIgnoreCase(e.getContent())){
                return false;
            }
        }
        return true;
    }
}
