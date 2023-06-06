/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j1.s.p0056;

import Manager.Menu;
import Model.Worker;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class J1SP0056 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Worker> list = new ArrayList<>();
        Menu opmenu = new Menu();
        Validation.ValidateInput val = new Validation.ValidateInput();
        while(true){
            opmenu.MenuOption();
            int choice = val.checkChoice();
            switch(choice) {
                case 1:
                    String code = val.checkCode();
                    String name = val.checkString("Enter name: ");
                    int age = val.checkAge();
                    String workLocation = val.checkString("Enter work location: ");
                    double salary = val.checkSalary();
                    opmenu.addWorker(code, name, age, salary, workLocation);
                    break;
                case 2:
                    String id = val.checkCode();
                    opmenu.changeSalary(id,1);
                    break;
                case 3:
                          id = val.checkCode();
                    opmenu.changeSalary(id,2);
                    break;
                case 4:
                    opmenu.displayHistory();
                    break;
                case 5:
                   return;
            }
        }
    }
    
}
