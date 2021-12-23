package estruturaderepeticao;

import java.util.Scanner;

public class Nota {
	
	public static void main(String[] args) {
		
		int nota;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nota:");
		nota = scan.nextInt();
		
		
		while (nota <0 || nota > 10) {
			System.out.println("Nota inválida! Di2gite novamente.");
			nota = scan.nextInt();
		}
		
		
	}

}
