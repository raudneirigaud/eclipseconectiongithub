package arrays;

public class Array {
	
	public static void main(String[] args) {
		
		int [] vetor = {-5,-6,10,2,3,9};
		
		
		int count = 0;
		
		System.out.println("Vetor:");
		while(count < vetor.length-1) {
			System.out.println(vetor[count]);
			count ++;
		}
		
		for(int i = vetor.length-1; i>=0 ; i-- ) {
			System.out.println(vetor[i]);
		}
		
	}

}
