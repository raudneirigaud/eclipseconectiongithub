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
			System.out.println("N�mero:");
			numero = scan.nextInt();
			count = count+1;
			
			 soma = soma + numero;

			
			 if (numero > maiorNumero) maiorNumero = numero;
			
			
			
		}while (count < 5) ;
		
	    System.out.println("Maior n�mero do la�o: " + maiorNumero);
        System.out.println("M�dia de n�meros informados: " + (soma/5));
		
	}

}
