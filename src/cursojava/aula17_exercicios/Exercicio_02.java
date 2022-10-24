package cursojava.aula17_exercicios;

import java.util.Scanner;

import javax.sound.sampled.Line;

public class Exercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String usuario;
		String senha;
		
		boolean loginValido = false;
		
		do {
			
			System.out.println("Digite o nome do usuario :");
			usuario = scan.next();			
			
			System.out.println("Digite a senha :");
			senha = scan.next();
			
			if(usuario.equalsIgnoreCase(senha)){
				loginValido = false;
				System.out.println("Senha igual ao Usuario! por favor escolha uma senha diferente!");
			}else {
				loginValido = true;
				System.out.println("Senha e Usuários válidos.");
			}
			
		} while(!loginValido);
		
	}

}
