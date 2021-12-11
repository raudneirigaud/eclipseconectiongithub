package javavariables;

public class VariablesJava {
	
	public static void main(String[] args) {
		
		
		/*
		 * Em Java, existem diferentes tipos de variáveis, por exemplo:
		 * 
		 * String- armazena texto, como "Olá". Os valores da string estão entre aspas
		 * duplas int - armazena inteiros (números inteiros), sem decimais, como 123 ou
		 * -123 float - armazena números de ponto flutuante, com decimais, como 19,99 ou
		 * -19,99 char- armazena caracteres únicos, como 'a' ou 'B'. Os valores dos
		 * caracteres são colocados entre aspas simples boolean - armazena valores com
		 * dois estados: verdadeiro ou falso
		 */
		
		
//		String
		
		String name = "Raudnei";
		System.out.println(name);
		
		
//		Inteiro
		
		int myNum01;
		myNum01 = 15;
		System.out.println(myNum01);
		
		int myNum02 = 15;
	    System.out.println(myNum02);
		
        int myNum03 = 15;
        myNum03 = 20;  // myNum is now 20
        System.out.println(myNum03);
		
		
		
//		Acrescentar FINAL em variabel
		
//		final int myNum04 = 15;
//		myNum04 = 20;  
		
		// will generate an error: cannot assign a value to a final variable
		
		
        int myNum04 = 5;
        System.out.println(myNum04);
        float myFloatNum = 5.99f;
        System.out.println(myFloatNum);
        char myLetter = 'D';
        System.out.println(myLetter);
        boolean myBool = true;
        System.out.println(myBool);
        String myText = "Hello";
        System.out.println(myText);
        
        
//        EXIBIR VARIAVEIS
        String myName05 = "John";
        System.out.println("Hello " + myName05);
        
        String firstName = "Raudnei";
        String lastName = "Rigaud";
        String fullName = firstName + lastName;
        System.out.println(fullName);
        
        int a = 5;
        int b = 6;
        System.out.println(a + b);
        
        int e = 5, f = 6, g = 50;
        System.out.println(e + f + g);
        
        
        
        
//        Identificadores Java
//        Todas as variáveis Java devem ser identificadas com nomes exclusivos .
//
//        Esses nomes exclusivos são chamados de identificadores .
//
//        Os identificadores podem ser nomes curtos (como x e y) ou nomes mais descritivos (idade, soma, volume total).
//
//        Observação: é recomendável usar nomes descritivos para criar um código compreensível e sustentável:
        
        
        
//        As regras gerais para nomear variáveis ​​são:
//
//        	Os nomes podem conter letras, dígitos, sublinhados e cifrões
//        	Os nomes devem começar com uma letra
//        	Os nomes devem começar com uma letra minúscula e não pode conter espaços em branco
//        	Os nomes também podem começar com $ e _ (mas não os usaremos neste tutorial)
//        	Os nomes diferenciam maiúsculas de minúsculas ("myVar" e "myvar" são variáveis ​​diferentes)
//        	Palavras reservadas (como palavras-chave Java, como intou boolean) não podem ser usadas como nomes
//        
        
	}
}
