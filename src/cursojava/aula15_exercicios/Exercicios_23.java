package cursojava.aula15_exercicios;

import java.util.Scanner;

public class Exercicios_23 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("*                     	   [ATÉ 5 KG]                	[ACIMA DE 5 KG]\n"
						 + "*[FD]- File duplo	R$ 4,90 por Kg			R$ 5,80 por Kg\n"
						 + "*[A]- Alcatra		R$ 5,90 por Kg			R$ 6,80 por Kg\n"
						 + "*[P]- Picanha		R$ 6,90 por kg			R$ 7,80 por Kg\n");
		
		System.out.println("Digite um tipo de carne na promoção: ");
		String tipoCarne = scan.next();
		
		System.out.println("Digite quantos Kg deseja: ");
		double pesoCarne = scan.nextDouble();
		
		System.out.println("Digite se a compra sera feita no cartão tabajara ? [S]-SIM OU [N]-NÃO");
		String cartaoTab = scan.next();
		
		double valorCarne = 0;
		
		if(tipoCarne.equalsIgnoreCase("FD")) {
			tipoCarne = "Filé Duplo";
			if(pesoCarne <= 5) {
				valorCarne = 4.90;
			}else if(pesoCarne > 5){
				valorCarne = 5.80;
			}
		}else if(tipoCarne.equalsIgnoreCase("A")){
			tipoCarne = "Alcatra";
			if(pesoCarne <= 5) {
				valorCarne = 5.90;
			}else if(pesoCarne > 5){
				valorCarne = 6.80;
			}
		}else if(tipoCarne.equalsIgnoreCase("P")) {
			tipoCarne = "Picanha";
			if(pesoCarne <= 5) {
				valorCarne = 6.90;
			}else if(pesoCarne > 5){
				valorCarne = 7.80;
			}
		}
		
		double valorParcial = pesoCarne * valorCarne;
		double valorTotal = 0;
		double valorDesc = 0;
		
		if(cartaoTab.equalsIgnoreCase("s")) {
			cartaoTab = "[SIM]";
			valorDesc = (valorParcial / 100) * 5;
			valorTotal = valorParcial - valorDesc;
		}else {
			cartaoTab = "[NÃO]";
			valorTotal = valorParcial;
		}
		
		System.out.println("\n!!MUITO OBRIGADO PELA PREFERENCIA!!");
		System.out.println("Carne da promoção: "+tipoCarne);
		System.out.printf("Quantidade em Kg: %.2f \n",pesoCarne);
		System.out.printf("Valor total: R$%.2f \n",valorParcial);
		System.out.println("Pago no cartão tabajara: "+cartaoTab);
		System.out.printf("Valor do desconto: R$%.2f \n",valorDesc);
		System.out.printf("Valor a pagar: R$%.2f \n",valorTotal);
		
	}

}
