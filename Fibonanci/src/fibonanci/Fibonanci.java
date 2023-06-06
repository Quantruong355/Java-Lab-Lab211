/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonanci;

/**
 *
 * @author Acer
 */
public class Fibonanci {

//    public static int fibonanci(int number, int a, int b){
//        //neu number = 0 dung chuong trinh
//        if( number == 0){
//           return 0;
//        }
//        System.out.print(a + ", ");
//        return fibonanci(--number, b, b + a);    //sau moi vong lap gan gia tri cua b cho a va b = b + a
//    }
    
    public static int fibonacci(int n) {
         if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);         //tinh gia tri phan tu tai n bang de quy
        }          
    }
    public static void main(String[] args) {
        //  fibonanci(45, 0, 1);
        for (int i = 0; i < 45; i++) {
            System.out.print(fibonacci(i) + ", ");
        }
    }
    
}
