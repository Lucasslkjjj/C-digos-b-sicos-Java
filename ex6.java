import java.util.*;
import java.util.Scanner;

 class pais
 {
   public static void main(String args[])
   { 
     Scanner data = new Scanner(System.in);
    System.out.println("insira um número para calcular seu antecessor e sucessor:");
   int numero = data.nextInt();
    int antecessor = numero - 1;
   int sucessor = numero + 1;
   System.out.println("o antecessor é:" + antecessor);
   System.out.println("o sucessor é:" + sucessor);
   }
 }
