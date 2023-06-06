/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validation;

import Model.Worker;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class ValidateInput {
     Scanner sc = new Scanner(System.in);
     public int checkChoice(){
        int choice = 0;
        while(true){
            try{
                System.out.print("Input option: ");
                choice = Integer.parseInt(sc.nextLine());
                if(choice >= 1 && choice <=5){
                    break;
                }else{
                    System.out.println("Choice must be [1,5] !!");
                }
            }catch(Exception e){
                System.out.println("Invalid!! Input again !!");
            }
        }
        return choice;
    }
     
     
      public String checkString(String mess){
        String name;
        String rex = "[a-zA-Z]+";
        while(true){
            try{
                System.out.print(mess);
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
      
      public int checkAge(){
         int id;
        while(true){
            try{
            System.out.print("Enter Age: ");
            id = Integer.parseInt(sc.nextLine());
            if(id >= 18 && id <= 50){
                break;
            }else{
                System.out.println("Must be [18,50]");
            }
        }catch(Exception e){
                System.out.println("Invalid number");
                }
    }
        return id;
}
      
        public double checkSalary(){
        double s;
        while(true){
            try{
            System.out.print("Enter salary: ");
            s = Double.parseDouble(sc.nextLine());
            if(s > 0 ){
                break;
            }else{
                System.out.println("Must be > 0");
            }
        }catch(Exception e){
                System.out.println("Invalid number");
                }
    }
        return s;
}
        
        public boolean checkCodeExist(ArrayList<Worker> list, String code) {
        //check from first to last list doctor
        for (Worker w : list) {
            if (code.equalsIgnoreCase(w.getId())) {
                return false;
            }
        }
        return true;
    }
        
          public String checkCode(){
        String code;
        String rex = "[a-zA-Z0-9 ]+";
        while(true){
            try{
                System.out.print("Enter Code: ");
                code = sc.nextLine();
                if( code != null && code.matches(rex) ){
                          break;
                }
            }catch(Exception e){
                System.out.println("Invalid Code !!");
            }
        }
         return code;
    }
          
}
