import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main
{
	public static void main(String[] args)
	{
		Scanner arrayss = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		System.out.println("insira 10 numeros para colocar em ordem crescente.");
		for( int num = 0; num < 10; num++) {
			System.out.println("insira o numero " +  (num + 1) +  ":");
			numeros.add(Integer.parseInt(arrayss.nextLine()));
		}
		Collections.sort(numeros);
		System.out.print("(");
			for(int crescente = 0; crescente < 10; crescente++) {
				System.out.print(numeros.get(crescente));
				
				if(crescente < 9) {
					System.out.print(",");
				}
				}
			
			System.out.print(")");
		}
		
		
}

