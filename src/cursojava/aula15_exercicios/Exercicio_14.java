package cursojava.aula15_exercicios;

import java.util.Scanner;

public class Exercicio_14 {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite a primeira nota: ");
	double nota1 = scan.nextDouble();
	
	System.out.println("Digite a segunda nota: ");
	double nota2 = scan.nextDouble();
	
	double media = (nota1 + nota2) / 2;
	
	String aproveitamento = "";
	if(media > 9.0 && media <= 10.0 ) {
		aproveitamento = "A";
//		System.out.println("Primeira Nota: " + nota1);
//		System.out.println("Segunda Nota: " + nota2);
//		System.out.println("Média: " + media);
//		System.out.println("Conceito: ["+aproveitamento+"]");
//		System.out.println("Condição: [APROVADO]");
		
	}else if(media > 7.5 && media <= 9.0 ) {
		aproveitamento = "B";
//		System.out.println("Primeira Nota: " + nota1);
//		System.out.println("Segunda Nota: " + nota2);
//		System.out.println("Média: " + media);
//		System.out.println("Conceito: ["+aproveitamento+"]");
//		System.out.println("Condição: [APROVADO]");
		
	}else if(media > 6.0 && media <= 7.5 ) {
		aproveitamento = "C";
//		System.out.println("Primeira Nota: " + nota1);
//		System.out.println("Segunda Nota: " + nota2);
//		System.out.println("Média: " + media);
//		System.out.println("Conceito: ["+aproveitamento+"]");
//		System.out.println("Condição: [APROVADO]");
		
	}else if(media > 4.0 && media <= 6.0 ) {
		aproveitamento = "D";
//		System.out.println("Primeira Nota: " + nota1);
//		System.out.println("Segunda Nota: " + nota2);
//		System.out.println("Média: " + media);
//		System.out.println("Conceito: ["+aproveitamento+"]");
//		System.out.println("Condição: [REPROVADO]");
		
	}else if(media > 0.0 && media <= 4.0 ) {
		aproveitamento = "E";
//		System.out.println("Primeira Nota: " + nota1);
//		System.out.println("Segunda Nota: " + nota2);
//		System.out.println("Média: " + media);
//		System.out.println("Conceito: ["+aproveitamento+"]");
//		System.out.println("Condição: [REPROVADO]");
		
	}else {
		System.out.println("!!!ATENÇÃO DIGITE NOTAS VALIDAS!!!");
	}
		System.out.printf("Primeira Nota: %.2f", nota1);
		System.out.printf("Segunda Nota: %.2f", nota2);
		System.out.printf("Média: %.2f", media);
		System.out.printf("Conceito: [%.2f",aproveitamento,"]");
	
	switch (aproveitamento) {
	case "A":
	case "B":
	case "C": System.out.println("Condição: [APROVADO]"); break;
	case "D":
	case "E": System.out.println("Condição: [REPROVADO]"); break;
	}
		
	}
}
