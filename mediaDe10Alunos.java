package VetoresMatrizeJava;

import java.util.Scanner;

public class mediaDe10Alunos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float [][] notas = new float[10][4];
		float [] medias = new float[10];
		float total = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Notas do " + (i+1) + "° aluno");
			for (int j = 0; j < 4; j++) {
				System.out.print("Insira a nota " + (j+1) + ": ");
				notas[i][j] = ler.nextFloat();
				total += notas[i][j];
			}
			medias[i] = (total / 4);
			total = 0;
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Nota do aluno " + i + ": " + medias[i]);
		}
	}

}
