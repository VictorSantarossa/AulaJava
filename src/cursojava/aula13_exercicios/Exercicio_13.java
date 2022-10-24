package cursojava.aula13_exercicios;

import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor que você ganha por hora: ");
		double salarioHora = scan.nextDouble();
		
		System.out.println("Digite quantas horas você trabalha por mês: ");
		double horaMês = scan.nextDouble();
		
		double salarioBruto = salarioHora * horaMês;
		double inss = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto / 100) * 5;
		double ir = (salarioBruto / 100) * 11;
		double totalDescontos = inss + sindicato + ir;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Salario Bruto: " + salarioBruto);
		System.out.println("INSS: " + inss);
		System.out.println("Sindicato: " + sindicato);
		System.out.println("IR: " + ir);
		System.out.println("Total Desconto: " + totalDescontos);
		System.out.println("Salário Liquido: " + salarioLiquido);	

	}

}
