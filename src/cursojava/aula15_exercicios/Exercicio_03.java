package cursojava.aula15_exercicios;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o sexo [F]ou[M]:");
		String input = scan.next();
		
		if(input.equalsIgnoreCase("f")) {
			System.out.println("F - FEMININO.");
		}else if(input.equalsIgnoreCase("m")){
			System.out.println("M - MASCULINO.");
		}else {
			System.out.println("Sexo Inválido.");
		}
		

	}

}
