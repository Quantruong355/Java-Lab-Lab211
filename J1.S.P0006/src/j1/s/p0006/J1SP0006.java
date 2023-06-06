/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j1.s.p0006;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class J1SP0006 {

    public static Scanner in = new Scanner(System.in);
        public static int checkInput(String mess,String err) {
        while(true){
            System.out.println(mess);
            try{
                int number = Integer.parseInt(in.nextLine());
                if(number<0){
                    System.out.println();
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
    
    static void insertionSort(int[] array) {
        int size = array.length;
        for (int i = 1; i < size; i++) {
            int value = array[i];
            int j = i;
            while(j > 0 && array[j-1] > value) {
                array[j] = array[j-1];
                j--;
            }
            array[j] = value;
        }
    }
    
 
    private static int binarySearch(int[] arr, int value, int left, int right){
       if(left > right){
              return - 1;  
            }
            int mid = ( right + left)/2;
            if(arr[mid] > value){                              
                return binarySearch(arr, value, left, mid - 1); 
            }
            if(arr[mid] < value){
                return binarySearch(arr, value, mid + 1, right);
            }
        return mid;       
    }
    
    public static void main(String[] args) {
         int numberOfArray = checkInput("Enter number of array:","The input must be at least 1");
         
        int a[]=RandomInput(numberOfArray);
        System.out.print("Unsorted array: ");
        display(a);
        System.out.print("Sorted array: ");
        insertionSort(a);
        display(a);
        int valuesearch = checkInput("Enter search value:","The input must be at least 1");
        int i = binarySearch(a, valuesearch, 0, a.length - 1);
    if(i == -1){
        System.out.println("Not Found !!");
    }else{
        System.out.println("Found " + valuesearch + " at index " + i); 
    }
}
}
