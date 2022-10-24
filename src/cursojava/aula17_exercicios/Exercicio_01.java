package cursojava.aula17_exercicios;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		boolean notaValida = false; 
		
		do {		
			
			System.out.println("Digite uma nota de 0 a 10 :");
			double nota = scan.nextDouble();
			
			if(nota >= 0 && nota <= 10){
				notaValida = true;
				System.out.println("Você digitou: " + nota + " Nota valida");
			}else{
				System.out.println("Nota inválida, digite novamente.");
			}
			
		} while	(!notaValida);	
		
	}

}
