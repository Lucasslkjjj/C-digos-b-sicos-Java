import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

 class amigos
 {
   public static void main(String args[])
   { 
    Scanner scan = new Scanner (System.in);
    String [] lista = new String[5];
    for (int amigos = 0; amigos < lista.length;  amigos++ ) {
      System.out.println("digite o nome de 5 amigos:");
      lista [amigos] = scan.nextLine();
      
        }
        System.out.println("seus amigos são:");        
      for (int amigos = 0; amigos < lista.length; amigos++) {
        System.out.println(""+ lista [amigos]);

        }
   }
 }
