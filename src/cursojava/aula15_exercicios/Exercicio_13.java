package cursojava.aula15_exercicios;

import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digigite o dia correspondente da semana: ");
		System.out.println("[1] - DOMINGO.");
		System.out.println("[2] - SEGUNDA.");
		System.out.println("[3] - TER�A.");
		System.out.println("[4] - QUARTA.");
		System.out.println("[5] - QUINTA.");
		System.out.println("[6] - SEXTA.");
		System.out.println("[7] - SABADO.");
		
		int diaSemana = scan.nextInt();
		
		switch(diaSemana){
		case 2: System.out.println("Segunda - Dia �til"); break;
		case 3: System.out.println("Ter�a - Dia �til"); break;
		case 4: System.out.println("Quarta - Dia �til"); break;
		case 5: System.out.println("Quinta - Dia �til"); break;
		case 6: System.out.println("Sexta - Dia �til"); break;
		case 7: System.out.println("Sabado - Fim de semana"); break;
		case 1: System.out.println("Domingo - Fim de semana"); break;
		default: System.out.println("!!!N�o � um dia da semana valido!!!");
		}

	}

}
