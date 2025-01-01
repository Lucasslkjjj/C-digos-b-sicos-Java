import java.util.*;
import java.util.Scanner;
   class saldo
 {
   public static void main(String args[])
   {
      Scanner mandioca = new Scanner(System.in);
      
      System.out.println("digite o saldo e irei fazer o reajuste de 1%:");
      float saldo = mandioca.nextFloat();
      float porcento = (float) 0.01;
      float alteracao = saldo * porcento;
      float total = saldo + alteracao;
    System.out.println("o total do seu saldo com o reajuste de 1% é:" + total);
      
   }
 }
