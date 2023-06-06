/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j1.s.p0073;

import Manager.Menu;
import Model.Expense;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class J1SP0073 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList<Expense> list = new ArrayList<>();
        Menu opmenu = new Menu();
        Validation.ValidateInput val = new Validation.ValidateInput();
        while(true){
            opmenu.MenuOption();
            int choice = val.checkChoice();
            switch(choice) {
                case 1:
                    opmenu.addExpense();
                    break;
                case 2:
                    opmenu.displayAll();
                    break;
                case 3:
                    opmenu.deleteExpense();
                    
                    break;
                case 4:
                    return;
            }
        }
    }
    }
    
