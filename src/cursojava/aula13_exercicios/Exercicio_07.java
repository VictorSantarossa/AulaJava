package cursojava.aula13_exercicios;

import java.util.Scanner;

public class Exercicio_07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o tamanho do lado do quadrado: ");
		double lado = scan.nextDouble();
		
		double area = Math.pow(lado, 2);
		
		System.out.println("A area do quadro �: " + area);
		System.out.println("O dobro da area do quadrado � " + (area * 2));
	}

}
