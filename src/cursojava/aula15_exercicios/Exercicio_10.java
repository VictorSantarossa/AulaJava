package cursojava.aula15_exercicios;

import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o turno em que voc� estuda : ([M] [V] [N])");
		String turno = scan.next();
		
		if(turno.length() > 1) {
			System.out.println("!!!O TURNO DIGITADO � INV�LIDO!!!");
		}else if(turno.equalsIgnoreCase("m")) {
			System.out.println("[M] - MATUTIINO (BOM DIA!!!)");
		}else if(turno.equalsIgnoreCase("v")) {
			System.out.println("[V] - VESPERTINO (BOA TARDE!!!)");
		}else if(turno.equalsIgnoreCase("n")) {
			System.out.println("[N] - NOTURNO (BOA NOITE!!!)");
		}else {
			System.out.println("!!!VALOR INV�LIDO!!!");
		}
		
		if(turno.length() > 1) {
			System.out.println("!!!O TURNO DIGITADO � INV�LIDO!!!");
		}else {
		switch(turno){
		case "M": System.out.println("[M] - MATUTIINO (BOM DIA!!!)"); break;
		case "V": System.out.println("[V] - VESPERTINO (BOA TARDE!!!)"); break;
		case "N": System.out.println("[N] - NOTURNO (BOA NOITE!!!)"); break;
		case "m": System.out.println("[M] - MATUTIINO (BOM DIA!!!)"); break;
		case "v": System.out.println("[V] - VESPERTINO (BOA TARDE!!!)"); break;
		case "n": System.out.println("[N] - NOTURNO (BOA NOITE!!!)"); break;
		default: System.out.println("!!!VALOR INV�LIDO!!!");
			}
		}

	}

}
