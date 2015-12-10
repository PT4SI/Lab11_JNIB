/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ckc
 */
import java.util.Scanner;
public class JNIB_ChanKaChun {
   // Declare the native method, and load the library
   ...
   ...
   public static void main(String args[]) {
      int x;
      int[] ys = new int[5];
      String sayHelloTo;
      Scanner sc = new Scanner(System.in);
System.out.print("Input the position of column: "); x = sc.nextInt();
System.out.print("Message: ");
sayHelloTo = sc.next();
System.out.print("Input the position of 5 rows: "); for(...) {
        // Ask the user to input 10 coordination
...
}
      greetings(x, sayHelloTo, ys);
   }
}
