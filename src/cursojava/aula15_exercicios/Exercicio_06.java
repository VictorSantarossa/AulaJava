package cursojava.aula15_exercicios;

import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		int num2 = scan.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		int num3 = scan.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("O maior numero digitado �: " + num1);
		}else if(num2 > num1 && num2 > num3) {
			System.out.println("O maior numero digitado �: " + num2);
		}else if(num3 > num1 && num3 > num2) {
			System.out.println("O maior numero digitado �: " + num3);
		}else {
			System.out.println("Existe dois ou mais n�meros iguais!");
		}

	}

}
