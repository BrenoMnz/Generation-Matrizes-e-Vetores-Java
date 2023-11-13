package VetoresMatrizeJava;

import java.util.Scanner;

public class OperacoesVetor {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int [] vetor = new int[10];
		int soma = 0;
		float media;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Insira o "+ (i+1) + "° número: ");
			vetor[i] = ler.nextInt();
		}
		
		System.out.print("Números nos índices pares do vetor: ");
		for (int i = 0; i < 10; i += 2) {
			System.out.print(vetor[i] + " ");
		}
		System.out.print("\nNúmeros nos índices impares do vetor: ");
		for (int i = 1; i < 10; i += 2) {
			System.out.print(vetor[i] + " ");
		}
		for (int i = 0; i < 10; i++) {
			soma += vetor[i];
		}
		System.out.print("\nSoma dos elementos do vetor: " + soma);
		System.out.print("\nMédia dos elementos do vetor: " + (soma / 10.0));
	}

}
