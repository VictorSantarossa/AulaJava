package cursojava.aula13_exercicios;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite o primerio numero: ");
		int num1 = scan.nextInt();
		System.out.println("Digite o segundo numero: ");
		int num2 = scan.nextInt();
		int resultado = num1 + num2;
		System.out.println("A soma dos numeros é de : " + resultado);
	}

}
