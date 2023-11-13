package VetoresMatrizeJava;

import java.util.Scanner;

public class BuscaNoVetor {	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int [] vetor = {2, 5, 1, 3, 5, 9, 7, 8, 10, 6};
		int num, pos = 0;
		boolean achou = false;
		
		System.out.print("Insira o número que deseja buscar no vetor: ");
		num = ler.nextInt();
		
		for (int i = 0; i < 10; i++) {
			if (num == vetor[i]) {
				achou = true;
				pos = i;
			}
		}
		
		if (achou == true) {
			System.out.println("\nO número " + num + " está na posição " + pos + " do vetor.");
		} else { 
			System.out.println("\nO número " + num + " não foi encontrado no vetor");
		}
	
	}

}
