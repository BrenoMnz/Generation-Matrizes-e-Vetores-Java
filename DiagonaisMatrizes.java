package VetoresMatrizeJava;

public class DiagonaisMatrizes {

	public static void main(String[] args) {
		int [][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int [] diagPrincipal = new int[3];
		int [] diagSecundaria = new int[3];
		int somaPrincipal = 0, somaSecundaria = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j) {
					diagPrincipal[i] = matriz[i][j];
					somaPrincipal += matriz[i][j];
				}
				if (i + j == 2) {
					diagSecundaria[i] = matriz[i][j];
					somaSecundaria += matriz[i][j];
				}
			}
		}
		
		System.out.print("Elementos da diagonal principal: ");
		for (int i = 0; i < 3; i++) {
			System.out.print(diagPrincipal[i] + " ");
		}
		System.out.println("\nSoma dos elementos: " + somaPrincipal);
		System.out.print("\nElementos da diagonal secundária: ");
		for (int i = 0; i < 3; i++) {
			System.out.print(diagSecundaria[i] + " ");
		}
		System.out.println("\nSoma dos elementos: " + somaSecundaria);
	}

}
