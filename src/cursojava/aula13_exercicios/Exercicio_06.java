package cursojava.aula13_exercicios;

import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o raio do circulo; ");
		double raio = scan.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A area do raio do circulo é: " + area);
		
	}

}
