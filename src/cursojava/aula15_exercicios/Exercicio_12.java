package cursojava.aula15_exercicios;

import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor que você ganha por hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Digite quantas horas você trabalha por mês: ");
		double horaMês = scan.nextDouble();
		
		double salarioBruto = valorHora * horaMês;
		
		int percentualIr = 0;
		
		if(salarioBruto <= 900) {
			percentualIr = 0;
//			double ir = (salarioBruto / 100) * percentualIr;
//			double inss = (salarioBruto / 100) * 10;
//			double fgts = (salarioBruto / 100) * 11;
//			double totalDesc = ir + inss;
//			double salarioLiquido = salarioBruto - totalDesc;
//			System.out.println("Valor Da Hora: R$" + valorHora);
//			System.out.println("Horas Trabalhadas No Mês: "+ horaMês +" HORAS");
//			System.out.println("Salário Bruto: R$" + salarioBruto);
//			System.out.println("Desconto IR - (INSENTO): R$" + ir);
//			System.out.println("Desconto INSS 10%: R$" + inss);
//			System.out.println("Desconto FGTS 11%: R$" + fgts);
//			System.out.println("Total Desconto: R$" + totalDesc);
//			System.out.println("Salario Liquido: R$" + salarioLiquido);
		
		}else if(salarioBruto <= 1500) {
			percentualIr = 5;
//			double ir = (salarioBruto / 100) * percentualIr;
//			double inss = (salarioBruto / 100) * 10;
//			double fgts = (salarioBruto / 100) * 11;
//			double totalDesc = ir + inss;
//			double salarioLiquido = salarioBruto - totalDesc;
//			System.out.println("Valor Da Hora: R$" + valorHora);
//			System.out.println("Horas Trabalhadas No Mês: "+ horaMês +" HORAS");
//			System.out.println("Salário Bruto: R$" + salarioBruto);
//			System.out.println("Desconto IR 5%: R$" + ir);
//			System.out.println("Desconto INSS 10%: R$" + inss);
//			System.out.println("Desconto FGTS 11%: R$" + fgts);
//			System.out.println("Total Desconto: R$" + totalDesc);
//			System.out.println("Salario Liquido: R$" + salarioLiquido);
		
		}else if(salarioBruto <= 2500) {
			percentualIr = 10;
//			double ir = (salarioBruto / 100) * percentualIr;
//			double inss = (salarioBruto / 100) * 10;
//			double fgts = (salarioBruto / 100) * 11;
//			double totalDesc = ir + inss;
//			double salarioLiquido = salarioBruto - totalDesc;
//			System.out.println("Valor Da Hora: R$" + valorHora);
//			System.out.println("Horas Trabalhadas No Mês: "+ horaMês +" HORAS");
//			System.out.println("Salário Bruto: R$" + salarioBruto);
//			System.out.println("Desconto IR 10%: R$" + ir);
//			System.out.println("Desconto INSS 10%: R$" + inss);
//			System.out.println("Desconto FGTS 11%: R$" + fgts);
//			System.out.println("Total Desconto: R$" + totalDesc);
//			System.out.println("Salario Liquido: R$" + salarioLiquido);
	
		}else if(salarioBruto > 2500) {
			percentualIr = 20;
//			double ir = (salarioBruto / 100) * percentualIr;
//			double inss = (salarioBruto / 100) * 10;
//			double fgts = (salarioBruto / 100) * 11;
//			double totalDesc = ir + inss;
//			double salarioLiquido = salarioBruto - totalDesc;
//			System.out.println("Valor Da Hora: R$" + valorHora);
//			System.out.println("Horas Trabalhadas No Mês: "+ horaMês +" HORAS");
//			System.out.println("Salário Bruto: R$" + salarioBruto);
//			System.out.println("Desconto IR 20%: R$" + ir);
//			System.out.println("Desconto INSS 10%: R$" + inss);
//			System.out.println("Desconto FGTS 11%: R$" + fgts);
//			System.out.println("Total Desconto: R$" + totalDesc);
//			System.out.println("Salario Liquido: R$" + salarioLiquido);
		
		}
		
		double ir = (salarioBruto / 100) * percentualIr;
		double inss = (salarioBruto / 100) * 10;
		double fgts = (salarioBruto / 100) * 11;
		double totalDesc = ir + inss;
		double salarioLiquido = salarioBruto - totalDesc;
		System.out.printf("Valor Da Hora: R$%.2f \n",valorHora);
		System.out.println("Horas Trabalhadas No Mês: " + horaMês +" HORAS");
		System.out.println("Salário Bruto: R$" + salarioBruto);
		System.out.println("Desconto IR " +percentualIr+"%: R$" + ir);
		System.out.println("Desconto INSS 10%: R$" + inss);
		System.out.println("Desconto FGTS 11%: R$" + fgts);
		System.out.println("Total Desconto: R$" + totalDesc);
		System.out.println("Salario Liquido: R$" + salarioLiquido);

	}
	
}