package cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {
		
		//convenção Java
		int idade = 23;
		String nome = "Victor";
		String nomeDoMeuCachorro = "Thor";
		String ano2022 = "2022";
		
		//aceito, mas não utilizado
		int _idade;
		int $idade;
		
		//não é convenção Java
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorro;
		String nomeDoMeucachorro;
		
		idade = 24;
		
		System.out.println("Idade = " + idade);
		System.out.println("Nome = " + nome);
		System.out.println("Nome Do Meu Cachorro = " + nomeDoMeuCachorro);
		
		//má prática
		int a = 10;
		String b = "Victor";
	}

}
