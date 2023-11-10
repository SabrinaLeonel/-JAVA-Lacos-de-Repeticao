package repeticaowhile;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		int n1, n2=0, i=0;
		Scanner leia = new Scanner(System.in);
		int iX15 = 0;
		
		//Entrada de dados
		System.out.println("Digite um número inteiro: ");
		n1 = leia.nextInt();
		System.out.println("Digite um segundo número inteiro que seja maior que o primeiro número: ");
		n2 = leia.nextInt();
		leia.close();
		
		//Verifica se o segundo número é maior que o Primeiro
		if(n1<n2) {
			
			//Transforma o prieiro número em um multiplo de 3 e 5 (iX15 = i multiplo de 15)
			for(i=n1; i%15 != 0; i++) {
				iX15 = i+1;
			}
			
			//laço para mostrar os multiplos de 3 e 5 no intervalo dos números informados
			for(n1 = iX15; iX15<n2;iX15 = iX15 + 15){
				
				System.out.println(iX15+" é multiplo de 3 e 5\n");
			}
		}
			
		//Caso o segundo número for menor que o primeiro
		else {
			System.out.println("o intervalo é inválido, digite um Segundo número maior!");
		}	
	}
}

