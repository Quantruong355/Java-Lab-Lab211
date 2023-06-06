/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j1.s.p0002;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class J1SP0002 {

    public static Scanner in = new Scanner(System.in);

   public static int checkInput(String mess,String err) {
        while(true){
            System.out.println(mess);
            try{
                int number = Integer.parseInt(in.nextLine());
                if(number<0){
                    System.out.println(err);
                }else
                    return number;
            }catch(Exception e){
                System.out.println("Invalid number!!");
            }          
   }
    }

    public static int[] RandomInput(int numberOfArray) {
        int a[] =new int[numberOfArray];
        for (int i = 0; i < numberOfArray  ; i++) {
           a[i] =new Random().nextInt(numberOfArray);
                    }
        return a;
       
    }
    public static void display(int a[]){
   
        for (int i = 0; i < a.length; i++) {
            if(i==0)System.out.print("[");
            System.out.print(a[i] );
            if(i==a.length-1)System.out.println("]");
            else System.out.print(", ");
        }
    }
    
    private static void sortArrayBySelectionSort(int[] a) {
        int min = 0;
        for (int i = 0; i < a.length; i++) {
            min = i;
            for (int j = i + 1; j < a.length ; j++) {
                if (a[j] < a[min]) {                     
                    min = j;
                }
            }
 //           System.out.println("min:" + a[min]);
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
            
  //          display(a);
        }
      
    }
    
    
    
    public static void main(String[] args) {
        int numberOfArray = checkInput("Enter number of array:","The input must be at least 1");
        int a[]=RandomInput(numberOfArray);
        System.out.print("Unsorted array: ");
        display(a);
        System.out.print("Sorted array: ");
        sortArrayBySelectionSort(a);
        display(a);
    }
    
}
