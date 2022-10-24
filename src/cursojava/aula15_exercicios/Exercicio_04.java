package cursojava.aula15_exercicios;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");
		String input = scan.next();
		
//		if(input.equalsIgnoreCase("a") || 
//				input.equalsIgnoreCase("e") || 
//				input.equalsIgnoreCase("i") || 
//				input.equalsIgnoreCase("o") || 
//				input.equalsIgnoreCase("u")){
//			System.out.println("A letra "+input+" é uma vogal.");
//		}else {
//			System.out.println("A letra "+input+" é uma consoante.");
//		}
		
		if(input.length() > 1) {
			System.out.println("Não é uma letra válida.");
		}else {
		switch(input){
		case "A": 
		case "E": 
		case "I": 
		case "O": 
		case "U":
		case "a": 
		case "e": 
		case "i": 
		case "o": 
		case "u": System.out.println("vogal"); break;
		default: System.out.println("consoante");
			}
		}
	}
}
