package estudos_de_sintaxe_variaveis_fluxos;

public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int quantidadePessoas = 3, idade = 16;

		if (idade >= 18) {
			System.out.println("Você é maior de idade!" + "\n" + "Seja bem Vindo");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você é menor de idade!" + "\n" + "Você não pode entrar!");
			} else {
				System.out.println("Você é menor de idade!" + "\n" + "Você não pode entrar!");
			}

		}
	}

}
