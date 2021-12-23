package estruturaderepeticao;

import java.util.Scanner;

public class NomeIdade {
	
	public static void main(String[] args) {
		String nome;
		int idade;
		
		
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("Qual seu nome?");
			nome = scan.next();
			
			if (nome.equals("0"))
				break;
			
			
			System.out.println("Qual sua idade?");
			idade = scan.nextInt();
		}
		
		System.out.println("Continua aqui...");
		
	}

}
