import java.util.*;
import java.util.Scanner;

 class media
 {
   public static void main(String args[])
   { 
     Scanner pao = new Scanner(System.in);
    int media = (7 + 8 + 9) / 3;
    int mediaa = (4 + 5 + 6) / 3;
    float total = (media + mediaa) / 2;
    System.out.println("a média de 8,9,7 é:" + media);
    System.out.println("a média de 4,5 e 6 é:" + mediaa);
    System.out.println("a soma das médias e a média dela é:" + total);
   }
 }
 