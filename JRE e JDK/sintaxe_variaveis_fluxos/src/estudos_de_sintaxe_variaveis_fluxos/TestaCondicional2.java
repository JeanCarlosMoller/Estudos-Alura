package estudos_de_sintaxe_variaveis_fluxos;

public class TestaCondicional2 {
	public static void main(String[] args) {
		
		// || Ou 
		// && e
		
		System.out.println("Testando condicionais");

		int quantidadePessoas = 1, idade = 20;
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println("Valor de acompanhado = " + acompanhado);

		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem Vindo");
		} else {
			System.out.println("Você não pode entrar!");
		}
		
	}

}