package cursojava.aula15_exercicios;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		int num2= scan.nextInt();
		
		if(num1 > num2) {
			System.out.println("O maior n�mero digitado �: " + num1);
		}else {
			System.out.println("O maior n�mero digitado �: " + num2);
		}

	}

}
