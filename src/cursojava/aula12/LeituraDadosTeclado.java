package cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo �: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome �: " + primeiroNome);
		
		System.out.println("Digite a sua idade: ");
		int idade1 = scan.nextInt();
		System.out.println("Sua idade �: " + idade1);
		
		System.out.println("Digite a sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("A sua altura �: " + altura);
		
		System.out.println("Digite o seu primeiro nome, idade,quantidade de filhos, altura e se tem bichinhos de estima��o");
		String primeiroNome2 = scan.next();
		int idade2 = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura2 = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Voc� digitou os seguintes valores: ");
		System.out.println("Primeiro nome: " + primeiroNome2);
		System.out.println("Idade: " + idade2);
		System.out.println("Quantidade de filhos: " + qtdFilhos);
		System.out.println("Altura: " + altura2);
		System.out.println("Tem Bichinho de estima��o" + temPet);
	}

}
