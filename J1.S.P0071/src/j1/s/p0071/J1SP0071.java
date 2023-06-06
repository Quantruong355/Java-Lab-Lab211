/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j1.s.p0071;

import Manager.Menu;
import Model.Task;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Acer
 */
public class J1SP0071 {
   private static AtomicInteger ID_GENERATOR = new AtomicInteger(1);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Task> list = new ArrayList<>();
        Menu opmenu = new Menu();
        Validate.ValidateInput val = new Validate.ValidateInput();
        while(true){
            opmenu.MenuOption();
            int choice = val.checkChoice();
            switch(choice) {
                case 1:
                    opmenu.addTask();
                    break;
                case 2:
                    opmenu.deleteTask();
                    break;
                case 3:
                 
                    opmenu.getDataTask();
                    break;
                case 4:
                    return;
            }
        }
    }
    
}
