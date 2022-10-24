package cursojava.aula13_exercicios;

import java.util.Scanner;

public class Exercicio_09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Farenheit: ");
		double tempFaren = scan.nextDouble();
		
		double tempCels = (5 * (tempFaren - 32) / 9);
		
		System.out.println("A temperatura em celsius é: " + tempCels);

	}

}
