package arrays;

import java.util.Scanner;

import javax.management.openmbean.OpenMBeanAttributeInfo;

public class Consoantes {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
		
		String [] consoantes = new String[6];
		int intQuantidadeConsoantes = 0;
		
		int count = 0;
		do {
			
			System.out.println("Digite a letra");
			String letra = scan.next();
			
			   if ( !(letra.equalsIgnoreCase("a") |
	                    letra.equalsIgnoreCase("e") |
	                    letra.equalsIgnoreCase("i") |
	                    letra.equalsIgnoreCase("o") |
	                    letra.equalsIgnoreCase("u")) )  {
	                consoantes[count] = letra;
	                intQuantidadeConsoantes++;
	            }
			
			   count++;
			   
		}while (count < consoantes.length);
		System.out.print("Consoantes: ");
        for ( String consoante  :  consoantes ) {
            if ( consoante != null)
                System.out.print(consoante + " ");
        }
        System.out.println("Quantidade de consoantes: " + intQuantidadeConsoantes);
        System.out.println(consoantes.length);
		
	}

}
