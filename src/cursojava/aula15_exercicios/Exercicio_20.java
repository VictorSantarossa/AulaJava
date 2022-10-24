package cursojava.aula15_exercicios;

import java.util.Scanner;

public class Exercicio_20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("!!!PARA RESPONDER DIGITE [S]-SIM OU [N]-NÃO!!!");
		
		System.out.println("Você telefoneu para a vítima? ");
		String resposta1 = scan.next();
		
		System.out.println("Você esteve no local do crime? ");
		String resposta2 = scan.next();
		
		System.out.println("Você mora perto da vítima? ");
		String resposta3 = scan.next();
		
		System.out.println("Você devia para a vítima? ");
		String resposta4 = scan.next();
		
		System.out.println("Você já trabalhou com a vítima? ");
		String resposta5 = scan.next();
		
		int participacao = 0;
		
		if(resposta1.equalsIgnoreCase("S")) {
			participacao++;
		}if(resposta2.equalsIgnoreCase("S")) {
			participacao++;
		}if(resposta3.equalsIgnoreCase("S")) {
			participacao++;
		}if(resposta4.equalsIgnoreCase("S")) {
			participacao++;
		}if(resposta5.equalsIgnoreCase("S")) {
			participacao++;
		}
		
		switch (participacao) {
			case 1: System.out.println("Você está classificado como [SUSPEITO]"); break;
			case 2: System.out.println("Você está classificado como [SUSPEITO]"); break;
			case 3: System.out.println("Você está classificado como [CÚMPLICE]"); break;
			case 4: System.out.println("Você está classificado como [CÚMPLICE]"); break;
			case 5: System.out.println("Você está classificado como [ASSASINO]"); break;
			default:
				System.out.println("Você está classificado como [INOCENTE]");
			}
		
		
	}

}
