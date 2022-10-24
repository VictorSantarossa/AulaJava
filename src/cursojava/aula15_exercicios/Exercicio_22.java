package cursojava.aula15_exercicios;

import java.util.Scanner;

public class Exercicio_22 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quantos Kg de morango deseja: ");
		double morangoKg = scan.nextDouble();
		
		System.out.println("Digite quantos Kg de maçã deseja: ");
		double macaKg = scan.nextDouble();
		
		double valorMorango = 0;
		double valorMaca = 0;
		
		if(morangoKg <= 5) {
			valorMorango = 2.50;	
		}else if(morangoKg > 5) {
			valorMorango = 2.20;
		}
		if(macaKg <= 5) {
			valorMaca = 1.80;
		}else if(macaKg > 5) {
			valorMaca = 1.50;
		}
		
		double valorKg_morango = morangoKg * valorMorango;
		double valorKg_maca = macaKg * valorMaca;
		
		double valorTotal = valorKg_morango + valorKg_maca;
		double totalKg = morangoKg + macaKg;
		
		if(valorTotal > 25 || totalKg > 8) {
			double desc = (valorTotal / 100) * 10;
			double valorDesc = valorTotal - desc;
			System.out.println("Quantidade De Morango Em Kg: "+morangoKg);
			System.out.println("Quantidade De Maçã Em Kg: "+macaKg);
			System.out.println("Valor Total A ser Pago: R$"+valorDesc);
		}else {
			System.out.println("Quantidade De Morango Em Kg: "+morangoKg);
			System.out.println("Quantidade De Maçã Em Kg: "+macaKg);
			System.out.println("Valor Total A ser Pago: R$"+valorTotal);
		}
		
	}

}
