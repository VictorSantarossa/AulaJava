package cursojava.aula13_exercicios;

import java.util.Scanner;

public class Exercicio_08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quanto voc� ganha por hora: ");
		double salarioHora = scan.nextDouble();
		
		System.out.println("Digite quantas horas voc� tabalha no m�s: ");
		double  horas = scan.nextDouble();
		
		double salario = salarioHora * horas;
		
		System.out.println("Seu salario no m�s sera de: " + salario);
		

	}

}
