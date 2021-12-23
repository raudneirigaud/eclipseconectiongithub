package estruturaderepeticao;

import java.util.Scanner;

public class Tabuada {
	
	
	
	public static void main(String[] args) {
		
		 int tabuada;
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Número para Tabuada:");
		 tabuada = scan.nextInt();
		 
		 for(int i=1; i <= 10; i++ ) {
			 System.out.println("Tabuada:"+ i * tabuada);
		 }
	}

}
