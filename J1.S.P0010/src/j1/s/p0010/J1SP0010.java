/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j1.s.p0010;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class J1SP0010 {

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
    //sort array by bubble sort
    private static void sortArrayByBubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {                 // loop array
            for (int j = 0; j < a.length - i - 1; j++) {     // loop unsorted part
                if (a[j] > a[j + 1]) {                       // compare current value with next value and swap with condition
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
      
    }
    
    
 
    private static int linearSearch(int[] arr, int value){
       for(int i = 0; i < arr.length ; i++){
           if(arr[i] == value){
               return i;
           }
       }
        return -1;       
    }
    public static void main(String[] args) {
           int numberOfArray = checkInput("Enter number of array:","The input must be at least 1");
         
        int a[]=RandomInput(numberOfArray);
        System.out.print(" Array: ");
        System.out.println(Arrays.toString(a));
       
        int valuesearch = checkInput("Enter search value:","The input must be at least 1");
        int i = linearSearch(a, valuesearch);
    if(i == -1){
        System.out.println("Not Found !!");
    }else{
        System.out.println("Found " + valuesearch + " at index " + i); 
    }
    }
    
}
