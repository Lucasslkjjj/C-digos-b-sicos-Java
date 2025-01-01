import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

 class tabuada
 {
   public static void main(String args[])
   
   { 
     
    Scanner scan = new Scanner ( System.in);
    System.out.println("insira o numero e mostrarei a tabuada até o 10:");
    int numero = scan.nextInt();
    for (int n = 0; n <= 10.; n++) {
      
    System.out.println("" + numero + "x" + n + "=" + (numero * n));
      
      }
 
   }
 }
