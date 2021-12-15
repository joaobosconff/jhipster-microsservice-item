package joao.tcc.ms.app.web.rest;

import java.util.Random;

public class CalculadoraMatriz {
	
	public static void init(int qntLinha) {
	
	    int qntColuna = qntLinha;

		    Random r = new Random();

		    int matrizA[][] = new int[qntLinha][qntColuna];
		    int matrizB[][] = new int[qntLinha][qntColuna];
		    int matrizABSoma[][] = new int[qntLinha][qntColuna];
		    int matrizABSub[][] = new int[qntLinha][qntColuna];
		    int matrizABMulti[][] = new int[qntLinha][qntColuna];

		    System.out.println(" A matriz 'A' é: ");
		    for (int linha = 0; linha < qntLinha; linha++) {
		        for (int coluna = 0; coluna < qntColuna; coluna++) {
		            matrizA[linha][coluna] = r.nextInt(9) + 1;
		            System.out.print(matrizA[linha][coluna] + " ");
		        }
		        System.out.println("");
		    }
		    System.out.println("_______________");

		    System.out.println("matriz B: ");
		    for (int linha = 0; linha < qntLinha; linha++) {
		        for (int coluna = 0; coluna < qntColuna; coluna++) {
		            matrizB[linha][coluna] = r.nextInt(9) + 1;
		            System.out.print(matrizB[linha][coluna] + " ");
		        }
		        System.out.println("");
		    }
		    System.out.println("______________________________");

		    System.out.println("A+B: ");
		    for (int linha = 0; linha < qntLinha; linha++) {
		        for (int coluna = 0; coluna < qntColuna; coluna++) {
		            matrizABSoma[linha][coluna] = matrizA[linha][coluna] + matrizB[linha][coluna];
		            System.out.print(matrizABSoma[linha][coluna] + " ");
		        }
		        System.out.println("");
		    }
		    System.out.println("______________________________");

		    System.out.println("A-B: ");
		    for (int linha = 0; linha < qntLinha; linha++) {
		        for (int coluna = 0; coluna < qntColuna; coluna++) {
		            matrizABSub[linha][coluna] = matrizA[linha][coluna] - matrizB[linha][coluna];
		            System.out.print(matrizABSub[linha][coluna] + " ");
		        }
		        System.out.println("");
		    }
		    System.out.println("______________________________");

		    System.out.println("AxB: ");
		    for (int linha = 0; linha < qntLinha; linha++) {
		        for (int coluna = 0; coluna < qntColuna; coluna++) {
		            matrizABMulti[linha][coluna] = matrizA[linha][coluna] * matrizB[linha][coluna];
		            System.out.print(matrizABMulti[linha][coluna] + " ");
		        }
		        System.out.println("");
		    }
	}
	
	public void somaMatriz(int qntLinhaColuna,int[][] matrizA,int[][] matrizB) {
		int matrizResultado[][] = new int[qntLinhaColuna][qntLinhaColuna];
		 System.out.println("A+B: ");
		    for (int linha = 0; linha < qntLinhaColuna; linha++) {
		        for (int coluna = 0; coluna < qntLinhaColuna; coluna++) {
		            matrizResultado[linha][coluna] = matrizA[linha][coluna] + matrizB[linha][coluna];
		            System.out.print(matrizResultado[linha][coluna] + " ");
		        }
		        System.out.println("");
		    }
	}
	public void subMatriz(int qntLinhaColuna,int[][] matrizA,int[][] matrizB) {
		int matrizResultado[][] = new int[qntLinhaColuna][qntLinhaColuna];
		 System.out.println("A-B: ");
		    for (int linha = 0; linha < qntLinhaColuna; linha++) {
		        for (int coluna = 0; coluna < qntLinhaColuna; coluna++) {
		            matrizResultado[linha][coluna] = matrizA[linha][coluna] - matrizB[linha][coluna];
		            System.out.print(matrizResultado[linha][coluna] + " ");
		        }
		        System.out.println("");
		    }
	}
	public void multiMatriz(int qntLinhaColuna,int[][] matrizA,int[][] matrizB) {
		int matrizResultado[][] = new int[qntLinhaColuna][qntLinhaColuna];
		 System.out.println("AxB: ");
		    for (int linha = 0; linha < qntLinhaColuna; linha++) {
		        for (int coluna = 0; coluna < qntLinhaColuna; coluna++) {
		            matrizResultado[linha][coluna] = matrizA[linha][coluna] * matrizB[linha][coluna];
		            System.out.print(matrizResultado[linha][coluna] + " ");
		        }
		        System.out.println("");
		    }
	}

}
