package estruturaderepeticao;

import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int fatorial;
		
		 System.out.println("Fatorial:");
		 fatorial = scan.nextInt();
		 
		 int multiplicacao = 1;
		 
		 
		 System.out.print(fatorial +"! = "); 
		 for (int i=fatorial; i >= 1 ; i--) {
			 multiplicacao = multiplicacao * i;
		 }
		System.out.println(multiplicacao);
	}

}
