package cursojava.aula15_exercicios;

import java.util.Scanner;

public class Exercicio_17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o ano desejado: ");
		int ano = scan.nextInt();
		
		if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)) {
			System.out.println("O ano de "+ano+" é um ano BISSEXTO.");
		}else {
			System.out.println("O ano de "+ano+" não é um ano BISSEXTO.");
		}	
				
	}

}
