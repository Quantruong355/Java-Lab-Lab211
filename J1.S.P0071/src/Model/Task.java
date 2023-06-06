/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Acer
 */
public class Task {
    private int    id;
    private String name;
    private int    tasktype;
    private String date;
    private double from;
    private double to;
    private String assignee;
    private String reviewer;

    
    public Task(){
        
    }
    
    public Task(int id, String name, int tasktype, String date, double from, double to, String assignee, String reviewer) {
        this.id = id;
        this.name = name;
        this.tasktype = tasktype;
        this.date = date;
        this.from = from;
        this.to = to;
        this.assignee = assignee;
        this.reviewer = reviewer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTasktype() {
        return tasktype;
    }

    public void setTasktype(int tasktype) {
        this.tasktype = tasktype;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }
    
    public String ConvertTasktype(){
        if(tasktype == 1){
            return "Code";
        }
        if(tasktype == 2){
            return "Test";
        }
        if(tasktype == 3){
            return "Design";
        }
        if(tasktype == 4){
            return "Review";
        }
        return null;
    }
    
    public double time(){
        double time = to - from;
        return time;
    }

    @Override
    public String toString() {
       return String.format("%-5d%-10s%-20s%-10s%10.1f%20s%20s",id,name,ConvertTasktype(),date,(to - from),assignee,reviewer);
    }
    
    
    
}
