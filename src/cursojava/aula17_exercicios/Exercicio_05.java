package cursojava.aula17_exercicios;

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double popA;
		double popB;
		double taxaA;
		double taxaB;
		
		boolean infoValidos = false;
		
		do{
		
			System.out.println("Digite a quantidade de habitantes da população A: ");
			popA = scan.nextDouble();
		
			if(popA > 0) {
				infoValidos = true;
			}else {
				infoValidos = false;
				System.out.println("Digite um numero valido!");
			}
		
		}while(!infoValidos);
		
			infoValidos = false;
		
		do {
		
			System.out.println("Digite a quantidade de habitantes da população B: ");
			popB = scan.nextDouble();
		
			if(popB > 0) {
				infoValidos = true;
			}else {
				infoValidos = false;
				System.out.println("Digite um numero valido!");
			}
			
		}while(!infoValidos);
		
			infoValidos = false;
		
		do {
	
			System.out.println("Digite a taxa de crescimento da população A: ");
			taxaA = scan.nextDouble();
	
			if(taxaA > 0) {
				infoValidos = true;
			}else {
				infoValidos = false;
				System.out.println("Digite um numero valido!");
			}
		
		}while(!infoValidos);			
		
			infoValidos = false;
		
		do {

			System.out.println("Digite a taxa de crescimento da população B: ");
			taxaB = scan.nextDouble();

			if(taxaB > 0) {
				infoValidos = true;
			}else {
				infoValidos = false;
				System.out.println("Digite um numero valido!");
			}
	
		}while(!infoValidos);		
		
			int cont = 0;
		
			while(popA < popB) {
			
			popA += (popA / 100) * taxaA;
			popB += (popB / 100) * taxaB;
			cont ++;
			
			}
		   
			System.out.printf("População A: %.2f \n", popA);
			System.out.printf("População B: %.2f \n", popB);
			System.out.println("Taxa de crescimento da população A: " + taxaA);
			System.out.println("Taxa de crescimento da população B: " + taxaB);
			System.out.println("Quantidade de Anos: " + cont);
		
	}
}
