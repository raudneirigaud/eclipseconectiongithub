package estruturaderepeticao;

public class Break {
	
	public static void main(String[] args) {
		
		
		for( int i=0; i < 15; i++) {
			
			if (i % 2 ==0) {
				System.out.println(i);
				
				if (i == 12) {
					break;
				}
				
			}
	
			
		}
		
		
		int contador = 0;
		while (contador < 15) {
			if ( contador % 2 == 0) {
				System.out.println(contador);
				
				if (contador == 12) {
					break;
				}
				
			}
			contador++;
			}
			
		
	}

}
