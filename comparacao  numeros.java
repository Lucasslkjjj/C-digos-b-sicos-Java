import java.util.*;
import java.util.Scanner;

 

 class numeros
 {
   public static void main(String args[])
   { 
    System.out.println("insira um número:");
    Scanner uc = new Scanner (System.in);
     int num_1 = uc.nextInt();
    System.out.println("insira o segundo número:");
    int num_2 = uc.nextInt();
    if (num_1 > num_2) {
    System.out.printf("o número %d é maior que o número %d", num_1 , num_2);
    } else if (num_1 < num_2) {
      System.out.printf("o número %d é maior que o número %d" , num_2, num_1);
      
   } else {
   System.out.println("os números são iguais.");
   }
 }
}