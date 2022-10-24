package cursojava.aula15_exercicios;

import java.util.Scanner;

public class Exercicio_19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		double num1 = scan.nextDouble();
		
		
		
		System.out.println("Digite o segundo numero: ");
		double num2 = scan.nextDouble();
		
		System.out.println("Digite a operação que deseja realizar entre os numeros: ");
		String op = scan.next();
		
		String posNeg = "";
		String parImp = "";
		double resultado = 0;
//		boolean valida = true;
//		
//		switch (op) {
//		case "+": resultado = num1 + num2; break;
//		case "-": resultado = num1 - num2; break;
//		case "*": resultado = num1 * num2; break;
//		case "/": resultado = num1 / num2; break;
//		default:
//			System.out.println("Operação inválida");
//			valida = false;
//		}
		
		if(op.equalsIgnoreCase("+")) {
			resultado = num1 + num2;
		}else if(op.equalsIgnoreCase("-")) {
			resultado = num1 - num2;
		}else if(op.equalsIgnoreCase("*")) {
			resultado = num1 * num2;
		}else if(op.equalsIgnoreCase("/")) {
			resultado = num1 / num2;
		} 
		if((resultado % 2) == 0) {
			parImp = "Par";
		}else {
			parImp = "Impar";
		} 
		if(resultado >= 0) {
			posNeg = "Positivo";
		}else {
			posNeg = "Negativo";
		}
		
		System.out.println("" + resultado);
		System.out.println("" + parImp);
		System.out.println("" + posNeg);

	}

}
