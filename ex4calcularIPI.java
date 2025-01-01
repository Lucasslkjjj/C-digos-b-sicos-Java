import java.util.*;
import java.util.Scanner;

 class vendas
 {
   public static void main(String args[])
   { 
     Scanner publico = new Scanner(System.in);
     float imposto_por_item = (float) 18.5;
    System.out.println("Insira a quantidade de janelas que você precisa:");
     float janelas = publico.nextFloat();
     float valor_janelas = 150;
     System.out.println("Insira a quantidade de retrovisores que você precisa:");
     float retrovisores = publico.nextFloat();
     float valor_retrovisores = 75;
    float valor_total = (valor_janelas * janelas + valor_retrovisores * retrovisores) *  (imposto_por_item / 100 + 1);
    System.out.println("o valor total a ser pagado pelas peças é:" + valor_total);                                               
   }
 }
