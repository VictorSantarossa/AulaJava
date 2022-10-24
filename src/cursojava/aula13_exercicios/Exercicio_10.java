package cursojava.aula13_exercicios;

import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Celsius: ");
		double tempCels = scan.nextDouble();
		
		double tempFaren = (tempCels * 1.8) + 32;
		
		System.out.println("A temperatura em Farenheit é: " + tempFaren);

	}

}
