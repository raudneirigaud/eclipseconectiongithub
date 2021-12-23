package estruturaderepeticao;

import java.util.Scanner;

public class Parimpar {
	
	
	public static void main(String[] args) {
		
		
		int qtdNumero;
        int numero;
        int pares =0 ;
        int impares  =0 ;

	      Scanner scan = new Scanner(System.in);
	      

	      int count = 0;
	      
	      System.out.println("Quantidade de números?");
	      qtdNumero = scan.nextInt();
		do {
			 System.out.println("Múmero");
		      numero = scan.nextInt();
		      
		      if (numero % 2 == 0) {
		    	  pares = pares + 1;
		      } else  {
		    	  impares = impares + 1;
		      }
		      
	          count ++;
		}while (count < qtdNumero);
		
		System.out.println("Números pares:"+ pares);
		System.out.println("Números impares:"+ impares);
	}

}
