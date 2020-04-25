package matrizes;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[][] mat = new int[n][n];

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				mat[i][j] = in.nextInt();

			}
		}

		System.out.println("Main diagonal");
		for (int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();

		int count = 0;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				if (mat[i][j] < 0) {
					count++;

				}
			}
			
		}
		System.out.println();
		System.out.println("Negative numbers");
		System.out.print(count +  " ");

		in.close();
	}

}
