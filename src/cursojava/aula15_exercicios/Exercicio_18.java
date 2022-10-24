package cursojava.aula15_exercicios;

import java.util.Scanner;

public class Exercicio_18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num = scan.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("O numero "+num+" é par.");
		}else {
			System.out.println("O numero "+num+" é impar.");
		}
		

	}

}
