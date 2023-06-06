/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j1.s.p0055;

import Manager.OptionMenu;
import Model.Doctor;
import java.awt.Menu;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class J1SP0055 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               ArrayList<Doctor> list = new ArrayList<>();
               OptionMenu opmenu = new OptionMenu();
        Validation.ValidateInput val = new Validation.ValidateInput();
        while(true){
            opmenu.MenuOption();
            int choice = val.checkChoice();
            switch(choice) {
                case 1:
                    opmenu.addDoctor();
                    break;
                case 2:
                     opmenu.updateDoctor();
                    break;
                case 3:
                    opmenu.deleteDoctor();
                    break;
                case 4:
                    opmenu.searchDoctor();
                    break;
                case 5:
                    return;
            }
        }
    }
    
}
