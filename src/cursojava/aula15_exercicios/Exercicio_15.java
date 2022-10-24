package cursojava.aula15_exercicios;

import java.util.Scanner;

public class Exercicio_15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro lado do triangulo: ");
		double lado1 = scan.nextDouble();
		
		System.out.print("Digite o segundo lado do triangulo: ");
		double lado2 = scan.nextDouble();
		
		System.out.print("Digite o terceiro lado do triangulo: ");
		double lado3 = scan.nextDouble();
		
		String triangulo = "";
		if(((lado1 + lado2) > lado3) ||
				((lado1 + lado3) > lado2) || 
				((lado2 + lado3) > lado1)) {
			
		if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
			triangulo = "EQUILÁTERO";
			System.out.println("A soma de todos os lados formam um triangulo: "+triangulo);
		}
		else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			triangulo = "ISÓSCELES";
			System.out.println("A soma de todos os lados formam um triangulo: "+triangulo);
		}else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
			triangulo = "ESCALENO";
			System.out.println("A soma de todos os lados formam um triangulo: "+triangulo);
		}
		
		}else {
			System.out.println("A SOMA DOS LADOS NÃO FORMAM UM TRIANGULO");
		}
	}
}
