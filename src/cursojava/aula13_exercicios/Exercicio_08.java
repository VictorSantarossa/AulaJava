package cursojava.aula13_exercicios;

import java.util.Scanner;

public class Exercicio_08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quanto você ganha por hora: ");
		double salarioHora = scan.nextDouble();
		
		System.out.println("Digite quantas horas você tabalha no mês: ");
		double  horas = scan.nextDouble();
		
		double salario = salarioHora * horas;
		
		System.out.println("Seu salario no mês sera de: " + salario);
		

	}

}
