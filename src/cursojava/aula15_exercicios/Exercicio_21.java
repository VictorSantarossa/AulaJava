package cursojava.aula15_exercicios;

import java.util.Scanner;

public class Exercicio_21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quantos litros foram vendido: ");
		double qtdL = scan.nextDouble();
		
		System.out.println("Digite o tipo do combustivel [A]-ÁLCOOL OU [G]-GASOLINA: ");
		String tipoCombustivel = scan.next();
		
		double valorAl = 1.90;
		double valorGa = 2.50;
		double percentual = 0;
		double valorDesc = 0;
		
		if(tipoCombustivel.equalsIgnoreCase("a")) {
			if(qtdL <= 20) {
				percentual = 3;
				double Desc = (valorAl /100) * percentual;
				valorDesc = valorAl - Desc;
			}else if(qtdL > 20) {
				percentual = 5;
				double Desc = (valorAl /100) * percentual;
				valorDesc = valorAl - Desc;
			}
		}else if(tipoCombustivel.equalsIgnoreCase("g")) {
			if(qtdL <= 20) {
				percentual = 4;
				double Desc = (valorGa /100) * percentual;
				valorDesc = valorGa - Desc;
			}else if(qtdL > 20) {
				percentual = 6;
				double Desc = (valorGa /100) * percentual;
				valorDesc = valorGa - Desc;
			}
		}
		
			double valorTotal = valorDesc * qtdL; 
		
		System.out.println("Tipo Combustivel: ["+tipoCombustivel+"].");
		System.out.printf("Quantidade em litros: %.2f Litros.\n",qtdL);
		System.out.printf("Valor total com Desconto: R$%.2f",valorTotal);
		
	}

}
