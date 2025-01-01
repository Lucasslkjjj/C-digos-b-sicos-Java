import java.util.*;
import java.util.Scanner;

 class salarios
 {
   public static void main(String args[])
   { 
     Scanner decreto = new Scanner(System.in);
    System.out.println("insira seu salário:");
    float salario_usuario = decreto.nextFloat();
    float  salario_minimo = (float) 788.00;
    float total = salario_usuario / salario_minimo;
    System.out.printf("a quantidade de salários mínimos que você ganha é:%.2f",total);
   }                                                                                                  
 }
