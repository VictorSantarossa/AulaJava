package cursojava.aula15_exercicios;

import java.util.Scanner;

public class Exercicio_08 {

	public static void main(String[] args) {

Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o pre�o do primeiro produto: ");
		double prod1 = scan.nextDouble();
		
		System.out.println("Digite o pre�o do segundo produto: ");
		double prod2 = scan.nextDouble();
		
		System.out.println("Digite o pre�o do terceiro produto: ");
		double prod3 = scan.nextDouble();
		
		if(prod1 <= prod2 && prod1 <= prod3) {
			System.out.println("O produto no valor de "+prod1+" � o mais barato pode compra-lo.");
		}else if(prod2 <= prod1 && prod2 <= prod3) {
			System.out.println("O produto no valor de "+prod2+" � o mais barato pode compra-lo.");
		}else if(prod3 <= prod1 && prod3 <= prod2) {
			System.out.println("O produto no valor de "+prod3+" � o mais barato pode compra-lo.");
		}
	}

}
