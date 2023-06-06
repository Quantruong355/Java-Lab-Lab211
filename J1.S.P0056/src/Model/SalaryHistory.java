/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Acer
 */
public class SalaryHistory extends Worker {
    private String status;
    private String date;

    
    public SalaryHistory(){
        
    }
    
    
    public SalaryHistory(String id, String name, int age, double salary, String workLocation, String status, String date) {
        super(id, name, age, salary, workLocation);
        this.status = status;
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("%-20s%-20s%-20d%-20.0f%-20s%-20s",super.getId(),super.getName(),super.getAge(),super.getSalary(),status,date);
    }
    
    
}
