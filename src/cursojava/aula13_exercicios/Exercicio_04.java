package cursojava.aula13_exercicios;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Digite a primeira NOTA do bimestre: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda NOTA do bimestre: ");
		double nota2 = scan.nextDouble();
		
		System.out.println("Digite a terceira NOTA do bimestre: ");
		double nota3 = scan.nextDouble();
		
		System.out.println("Digite a quarta NOTA do bimestre: ");
		double nota4 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A media do aluno nesse bimestre é: " + media);
		
		
		
		
		
	}

}
