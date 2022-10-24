package cursojava.aula17_exercicios;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String nome;
		String sexo;
		String estadoCivil;
		int idade;
		double salario ;
		
		boolean infoValidos = false;
		
		do {
			
			System.out.println("O NOME PRECISA TER MAIS DO QUE TRÊS CARACTERES.");
			System.out.println("Digite o nome: ");
			nome = scan.next();
		
			if(nome.length() > 3){
				infoValidos = true;
		
			}else {
				System.out.println("Informações Invalidas!");
			
			}
			
		}while(!infoValidos);
		
		infoValidos = false;
		
		do {
			
			System.out.println("A IDADE PRECISA SER ENTRE 0 E 150.");
			System.out.println("Digite a idade: ");
			idade = scan.nextInt();
			
			if(idade > 0 && idade <= 150) {
				infoValidos = true;		
		
			}else {
				System.out.println("Informações Invalidas!");
		
			}
			
		}while(!infoValidos);
		
		infoValidos = false;
		
		do {
			
			System.out.println("O SALÁRIO PRECISA SER MAIOR QUE R$00.");
			System.out.println("Digite o salario: ");
			salario = scan.nextDouble();
		
			if(salario > 0) {
				infoValidos = true;
										
			}else {
				System.out.println("Informações Invalidas!");
		
			}
			
		}while(!infoValidos);			
							
		infoValidos = false;
		
		do {
			
			System.out.println("O SEXO PRECISA SER 'F' OU 'M'.");
			System.out.println("Digite o sexo: ");
			sexo = scan.next();
		
			if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				infoValidos = true;
												
			}else {
				System.out.println("Informações Invalidas!");
									
			}
			
		}while(!infoValidos);
		
		infoValidos = false;
		
		do {
			
			System.out.println("O ESTADO CIVIL PRECISA SER 'S' , 'C' , 'V' OU 'D'.");
			System.out.println("Digite o estado civil: ");
			estadoCivil = scan.next();
			
			if(estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
				infoValidos = true;
										
			}else {
				System.out.println("Informações Invalidas!");
				
			}
			
		}while(!infoValidos);
		
		System.out.println("AS INFORMAÇÕES COLETADAS FORAM: ");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: R$" + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);
		
	}

}
