package cursojava.aula17_exercicios;

public class Exercicio_04 {

	public static void main(String[] args) {
		
		int popA = 80000;
		int popB = 200000;
		int cont = 0;
		
		while(popA < popB) {
			
			popA += (popA / 100) * 3;
			popB += (popB / 100) * 1.5;
			cont ++;
			
		}
		   
		System.out.println("Popula��o A: " + popA);
		System.out.println("Popula��o B: " + popB);
		System.out.println("Quantidade de Anos: " + cont);
	}

}
