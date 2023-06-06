/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validation;

import Manager.OptionMenu;
import Model.Doctor;
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
    
    public boolean checkCodeExist(ArrayList<Doctor> ld, String code) {
        //check from first to last list doctor
        for (Doctor doctor : ld) {
            if (code.equalsIgnoreCase(doctor.getCode())) {
                return false;
            }
        }
        return true;
    }
    
    public String checkCode(ArrayList<Doctor> list){
        String code;
        String rex = "[a-zA-Z0-9 ]+";
        while(true){
            try{
                System.out.print("Enter Code: ");
                code = sc.nextLine();
                if( code != null && code.matches(rex) ){
                     if(checkCodeExist(list, code)){
                         break;
                     }else{
                         System.out.println("Code existed !!");
                     }
                    
                }
            }catch(Exception e){
                System.out.println("Invalid Code !!");
            }
        }
        return code;
    }
    
    
    
     
    
    public String checkName(){
        String name;
        String rex = "[a-zA-Z ]+";
        while(true){
           
            try{
                System.out.print("Enter Name: ");
                name = sc.nextLine();
                if( name != null && name.matches(rex)){
                    break;
                }
                System.out.println("Name cannot be null or number !!");
            }catch(Exception e){
                System.out.println("Invalid !!");
            }
        }
        return name;
    }
    
    public String updateName(){
        String name;
        String rex = "[a-zA-Z ]+";
        while(true){
           
            try{
                System.out.print("Enter Name: ");
                name = sc.nextLine();
                if( name.equalsIgnoreCase("") ||  name.matches(rex)){
                    break;
                }
               
            }catch(Exception e){
                System.out.println("Invalid !!");
            }
        }
        return name;
    }
    
      public String updateSpec(){
        String spec;
        String rex = "[a-zA-Z]+";
        while(true){
           
            try{
                System.out.print("Enter Specialization: ");
                spec = sc.nextLine();
                if(spec.equalsIgnoreCase("") || spec.matches(rex)){
                    break;
                }
                System.out.println("Cannot be null or number !!");
            }catch(Exception e){
                System.out.println("Invalid !!");
            }
        }
        return spec;
    }
      
    public String checkSpec(){
        String spec;
        String rex = "[a-zA-Z]+";
        while(true){
           
            try{
                System.out.print("Enter Specialization: ");
                spec = sc.nextLine();
                if( spec != null && spec.matches(rex)){
                    break;
                }
                System.out.println("Cannot be null or number !!");
            }catch(Exception e){
                System.out.println("Invalid !!");
            }
        }
        return spec;
    }
    
    public Integer checkAvail(){
        Integer a;
        while(true){
            try{
                System.out.print("Enter Availability: "); 
                a = Integer.valueOf(sc.nextLine());
                if(  a >= 0){
                    break;
                }else{
                    System.out.println("Must be >= 0");
                }
            }catch(Exception e){
                System.out.println("Invalid !!");
            }
        }
        return a;
    }
    
    public String updateAvail(){
        String a;
        String rex = "[0-9]+";
        while(true){
            try{
                System.out.print("Enter Availability: "); 
                a = sc.nextLine();
                if(a.equalsIgnoreCase("")|| a.matches(rex)){
                    break;
                }
            }catch(Exception e){
                System.out.println("Invalid !!");
            }
        }
        return a;
    }
    
  public String getCode(ArrayList<Doctor> list){
        String code;
        String rex = "[a-zA-Z0-9 ]+";
        while(true){
            try{
                System.out.print("Enter Code: ");
                code = sc.nextLine();
                if( code != null && code.matches(rex) ){
                     if(!checkCodeExist(list, code)){
                         break;
                     }else{
                         System.out.println("Code not found !!");
                     }
                }
            }catch(Exception e){
                System.out.println("Invalid Code !!");
            }
        }
        return code;
    }
  
    public String getCodeSearch(){
        String code;
        String rex = "[a-zA-Z0-9 ]+";
        while(true){
            try{
                System.out.print("Enter Code: ");
                code = sc.nextLine();          
                  break;  
            }catch(Exception e){
                System.out.println("Invalid Code !!");
            }
        }
        return code;
    }
    
    public boolean checkDoctorExist(ArrayList<Doctor> list ,String code, String name, String Spec, int avail) {
        //check from first to last list doctor
        for (Doctor d : list) {
            if (code.equalsIgnoreCase(d.getCode()) && name.equalsIgnoreCase(d.getName()) 
                     && Spec.equalsIgnoreCase(d.getSpec()) && avail == d.getAvail()){
                return false;
            }
        }
        return true;
    }
    
     public Doctor getDoctorByCode(ArrayList<Doctor> list, String code) {
        for (Doctor doctor : list) {
            if (doctor.getCode().equalsIgnoreCase(code)) {
                return doctor;
            }
        }
        return null;
    }
     
     
}
