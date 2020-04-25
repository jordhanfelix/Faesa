package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {
	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Entre com o nome do departamento: ");
		String departmentName = in.nextLine();
		System.out.println("Dados do trabalhador");
		System.out.print("Nome: ");
		String nome = in.nextLine();
		System.out.print("Level: ");
		String level = in.nextLine();
		System.out.print("Salario base: ");
		double salario = in.nextDouble();

		Worker worker = new Worker(nome, WorkerLevel.valueOf(level), salario, new Department(departmentName));

		System.out.print("Quantos Contratos possui o trabalhador? ");
		int n = in.nextInt();

		for (int i = 1; i <=n; i++) {
			System.out.println("Entre com o contrato Nº" + i + " Data:");
			System.out.print("DATA (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(in.next());
			System.out.print("Valor por hora: ");
			double valuePerHour = in.nextDouble();
			System.out.print("Duração do Contrato: ");
			int hours = in.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);

		}
		System.out.println();
		System.out.println("Entre com o mês e o ano para calcular o salario (MM/YYYY): ");
		String x = in.next();

		int mes = Integer.parseInt(x.substring(0, 2));
		int ano = Integer.parseInt(x.substring(3));
	
		System.out.println("Nome: "+ worker.getName());
		System.out.println("Departamento: "+ worker.getDepartment().getName());
		System.out.println("Salario a receber:" + x + ":" + String.format("%.2f", worker.income(ano, mes)) );
		
		
		in.close();
	}

}
