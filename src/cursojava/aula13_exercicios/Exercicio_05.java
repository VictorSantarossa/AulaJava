package cursojava.aula13_exercicios;

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digete o valor em METROS: ");
		double metro = scan.nextDouble();
		
		double cm = metro*100;
		
		System.out.println("O numero digita em CM sera de: " + cm);
	}

}
