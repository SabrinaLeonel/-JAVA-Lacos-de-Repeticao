package repeticaowhile;

import java.util.Scanner;


public class Exercicio5 {
	
	public static void main(String[] args) {
		
		int numero = 0, soma = 0;
		Scanner leia = new Scanner(System.in);
				
		do {
			//Entrada de dados
			System.out.println("Digite um número: ");
			numero = leia.nextInt();

			
			if(numero > 0) {
				
				soma += numero;
			}
		}
		
		while(numero !=0);
		
		System.out.println("A soma dos números positivos é: "+soma);
		
		leia.close();
	}
}
