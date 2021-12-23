package estruturaderepeticao;

import java.util.Scanner;

public class maioremedia {
	
	
	public static void main(String[] args) {
		
		int numero;
		int count= 0;
		int maiorNumero=0;
		int soma=0;
        Scanner scan = new Scanner(System.in);


		do {
			System.out.println("Número:");
			numero = scan.nextInt();
			count = count+1;
			
			 soma = soma + numero;

			
			 if (numero > maiorNumero) maiorNumero = numero;
			
			
			
		}while (count < 5) ;
		
	    System.out.println("Maior número do laço: " + maiorNumero);
        System.out.println("Média de números informados: " + (soma/5));
		
	}

}
