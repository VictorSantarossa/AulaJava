package cursojava.aula15_exercicios;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int num = scan.nextInt();
		
		if(num >= 0) {
			System.out.println("O n�mero " + num + " � positivo.");
		}else {
			System.out.println("O n�mero " + num + " � negativo.");
		}

	}

}
