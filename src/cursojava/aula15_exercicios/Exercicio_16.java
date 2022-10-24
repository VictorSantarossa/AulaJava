package cursojava.aula15_exercicios;

import java.util.Scanner;

public class Exercicio_16 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor de [A]: ");
		double valorA = scan.nextDouble();
		
		if(valorA == 0) {
			System.out.println("Não é equação de segundo grau.");
		}else {
		System.out.println("Digite o valor de [B]: ");
		double valorB = scan.nextDouble();
		
		System.out.println("Digite o valor de [C]: ");
		double valorC = scan.nextDouble();
		
		double delta = (valorB*valorB) - (4*valorA*valorC);
		if (delta < 0) {
			System.out.println("Delta negativo");
		}else {
			
			System.out.println("Delta: "+delta);
			
			double x1 = ((- valorB) + Math.sqrt(delta)) / (2*valorA);
			double x2 = ((- valorB) - Math.sqrt(delta)) / (2*valorA);
			
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
		
		}
	}

}
