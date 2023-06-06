/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Acer
 */
public class Doctor {
    private String code;
    private String name;
    private String Spec;
    private int    avail;
    
    public Doctor(){
        
    }

    public Doctor(String code, String name, String Spec, int avail) {
        this.code = code;
        this.name = name;
        this.Spec = Spec;
        this.avail = avail;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpec() {
        return Spec;
    }

    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    public int getAvail() {
        return avail;
    }

    public void setAvail(int avail) {
        this.avail = avail;
    }

    @Override
    public String toString() {
       return String.format("%-20s%-20s%20s%20d", code,name,Spec,avail);
    }
    
    
}
