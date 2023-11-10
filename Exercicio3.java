package repeticaowhile;

import java.util.Scanner;


public class Exercicio3 {
	
	public static void main(String[] args) {
		
		int idade = 0, menor21 = 0, maior50 = 0 ;
		Scanner leia = new Scanner(System.in);
				
		while(idade >=0) {
			
			//Entrada de dados
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();

			
			if(idade == 0) {
				System.out.println("Idade inváida! Digite uma idade a partir de 1");
			}
			
			if(idade <21 && idade >=1) {
				menor21 ++; 
			}
			
			if(idade >50) {
				maior50 ++; 
			}
		}
		
		System.out.println("Total de pessoas menores de 21 anos: "+menor21);
		System.out.println("Total de pessoas maiores de 50 anos: "+maior50);
		
		leia.close();
	}
}
