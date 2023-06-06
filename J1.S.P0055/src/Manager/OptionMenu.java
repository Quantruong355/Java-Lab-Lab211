/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manager;

import Model.Doctor;
import Validation.ValidateInput;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class OptionMenu {
    ArrayList<Doctor> list = new ArrayList<>();   
    Validation.ValidateInput val = new ValidateInput();
    Scanner sc = new Scanner(System.in);
    
     public void MenuOption(){
         System.out.println("1. Add Doctor");
         System.out.println("2. Update Doctor");
         System.out.println("3. Delete Doctor");
         System.out.println("4. Search Doctor");
         System.out.println("5. Exit");
     }
     
     public void addDoctor(){
         while(true){
             
                   String code = val.checkCode(list);
                   String name = val.checkName();
                   String Spec = val.checkSpec();
                   int avail = val.checkAvail();  
                   if(val.checkDoctorExist(list, code, name, Spec, avail)){
                 Doctor d= new Doctor(code, name, Spec, avail);
                   list.add(d);
                   System.out.println("Add successful !!");
                   System.out.println();
                   return;
             }else{
                       System.out.println("Duplicate !!");
                   }
                   
         }
}
     
     
     public void deleteDoctor(){
          System.out.println("----------Delete Doctor -------");
         String code = val.getCode(list);
         while(true){
         for(Doctor d : list){
             if(code.equalsIgnoreCase(d.getCode())){
                 list.remove(d);
                 System.out.println("Delete successful!!");
                 System.out.println();
                 return;
             }else{
                 System.out.println("Code not found!!");
             }
          
         }
     }
     }
         
         public void searchDoctor(){
             String text = val.getCodeSearch();
             for(Doctor d : list){
                 if(text.equalsIgnoreCase(d.getCode()) || text.equalsIgnoreCase(d.getName()) || text.equalsIgnoreCase(d.getSpec())
                         || text.equalsIgnoreCase(String.valueOf(d.getAvail()))){
                      System.out.printf("%-20s%-20s%20s%20s\n","Code","Name","Specialization","Availability");
                     System.out.println(d);
                     System.out.println();
                 } 
                 
             }
              if(text.isEmpty()){
                  DisplayAll();
              }
         }
         
         public void updateDoctor() {
        while(true){
              String code = val.getCode(list);
        Doctor doctor = val.getDoctorByCode(list, code);
        String name = val.updateName();
        String specialization = val.updateSpec();
        String availability = val.updateAvail();
        if(name.isEmpty() && specialization.isEmpty() && availability.isEmpty()){
            System.out.println("Not change !!"); 
            System.out.println();
            return;
        }else{
            
                 doctor.setCode(code);
        doctor.setName(name);
        doctor.setSpec(specialization);
        doctor.setAvail(Integer.parseInt(availability));
        System.err.println("Update successful !!");
             System.out.println();
             return;
        }
        }
      
             
             
            
        }
            
    
     
     public void DisplayAll(){
         System.out.printf("%-20s%-20s%20s%20s\n","Code","Name","Specialization","Availability");
         for(Doctor t : list){
             System.out.println(t);
         }
         System.out.println();
     }
}

