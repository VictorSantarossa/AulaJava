package cursojava.aula15_exercicios;

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o seu salario atual: ");
		double salario = scan.nextDouble();
		
		int percentual = 0;
		
		if(salario <= 280){
			percentual = 20;
//			double aumento = (salario /100) * percentual;
//			double salarioAjustado = salario + aumento;
//			System.out.println("Salario antes do reajuste: " + salario);
//			System.out.println("Percentual de aumento aplicado: 20% do salario");
//			System.out.println("Valor do aumento: " + aumento);
//			System.out.println("Novo salario, após o aumento: " + salarioAjustado);
		
		}else if(salario > 280 && salario <= 700) {
			percentual = 15;
//			double aumento = (salario /100) * percentual;
//			double salarioAjustado = salario + aumento;
//			System.out.println("Salario antes do reajuste: "+salario);
//			System.out.println("Percentual de aumento aplicado: 15% do salario");
//			System.out.println("Valor do aumento: "+aumento);
//			System.out.println("Novo salario, após o aumento: "+salarioAjustado);
		
		}else if(salario > 700 && salario <= 1500) {
			percentual = 10;
//			double aumento = (salario /100) * percentual;
//			double salarioAjustado = salario + aumento;
//			System.out.println("Salario antes do reajuste: "+salario);
//			System.out.println("Percentual de aumento aplicado: 10% do salario");
//			System.out.println("Valor do aumento: "+aumento);
//			System.out.println("Novo salario, após o aumento: "+salarioAjustado);
		
		}else if(salario > 1500){
			percentual = 5;
//			double aumento = (salario /100) * percentual;
//			double salarioAjustado = salario + aumento;
//			System.out.println("Salario antes do reajuste: "+salario);
//			System.out.println("Percentual de aumento aplicado: 5% do salario");
//			System.out.println("Valor do aumento: "+aumento);
//			System.out.println("Novo salario, após o aumento: "+salarioAjustado);
		
		}
		
		double aumento = (salario /100) * percentual;
		double salarioAjustado = salario + aumento;
		System.out.println("Salario antes do reajuste: R$"+salario);
		System.out.println("Percentual de aumento aplicado: "+percentual+"% do salario");
		System.out.println("Valor do aumento: R$"+aumento);
		System.out.println("Novo salario, após o aumento: R$"+salarioAjustado);
		
	}

}
