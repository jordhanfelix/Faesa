package Program;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Boletim {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		Aluno aluno = new Aluno();

		aluno.nome = in.nextLine();
		aluno.nota1 = in.nextDouble();
		aluno.nota2 = in.nextDouble();
		aluno.nota3 = in.nextDouble();

		System.out.printf("FINAL GRADE = ", aluno.result());

		if (aluno.result() < 60) {

			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", aluno.missingP());
		} else {
			System.out.printf("PASS");

		}

		in.close();
	}

}
