package estruturaderepeticao;

public class teste {
	
	public static void main(String[] args) {
		
		
// Mostre numeros de 3 a 11 sendo que itere de 2 em 2 entretando quando o loop passar pelo 7
		//este nao dever ser exibido .
		
		for ( int i =3 ; i < 12; i++) {
			
			if (i % 2 != 0 && i != 7) {
			
					System.out.println(i);
				
		      } 
			
			
		}
		
		// Faça um while que exiba um texto 5 vezes com uma expressao de controle e uma variável booleana
		
		int contador = 0;
		while(contador < 5) {
			System.out.println("Exibir texto 5 vezes");
			contador++;
		}
		
		
	}

}
