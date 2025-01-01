import java.util.*;
import java.util.Scanner;

 class idade
 {
   public static void main(String args[])
   { 
     Scanner leitura = new Scanner(System.in);
    System.out.println("insira a sua idade em anos:");
    int anos  = leitura.nextInt();
    System.out.println("Insira agora os meses:");
    int meses = leitura.nextInt();
    System.out.println("insira os dias:");
    int dias = leitura.nextInt();
    int anoss = anos * 365;
    int mesess = meses * 30;
    int total = anoss + mesess + dias;
    System.out.print("o tanto de dias que você está na terra é:" + total);
    
   }
 }
