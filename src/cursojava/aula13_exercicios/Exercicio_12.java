package cursojava.aula13_exercicios;

import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a altura: ");
		double altura = scan.nextDouble();
		
		double pesoId = (72.7 * altura) - 58;
		System.out.println("O peso ideial é: " + pesoId);

	}

}
