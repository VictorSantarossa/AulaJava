package cursojava.aula15_exercicios;

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota do aluno: ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if(media >= 7 && media < 10) {
			System.out.println("A media do aluno foi ["+media+"] - (APROVADO)");
		}else if(media < 7 && media == 0) {
			System.out.println("A media do aluno foi ["+media+"] - (REPROVADO)");
		}else if(media == 10 && media < 11){
			System.out.println("A media do aluno foi ["+media+"] - (APROVADO COM DISTINÇÃO)");
		}else {
			System.out.println("!!!NOTA INVÁLIDA!!!");
		}

	}

}
