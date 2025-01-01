import java.util.*;
import java.util.Scanner;

 class seila
 {
   public static void main(String args[])
   { 
    System.out.println("insira um número inteiro:");
    Scanner bola = new Scanner(System.in);
    int numero = bola.nextInt();
    if (numero > 0) {
      System.out.println("o numero é positivo.");
     } else if (numero < 0) {
        System.out.println("o número é negativo.");
        } else {
          System.out.println("seu número é zero.");
       }
   }
 }
