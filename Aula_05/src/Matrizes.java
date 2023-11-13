import java.util.Scanner;

public class Matrizes {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		int[][] matrizN = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		for(int iLinha = 0; iLinha < matrizN.length; iLinha++) {
			for(int iColuna = 0; iColuna < matrizN.length; iColuna++) 
					System.out.print(matrizN[iLinha][iColuna] + " ");
		}
		
	}

}
