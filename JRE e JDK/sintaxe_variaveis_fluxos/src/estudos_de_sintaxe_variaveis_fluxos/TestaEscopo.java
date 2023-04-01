package estudos_de_sintaxe_variaveis_fluxos;

public class TestaEscopo {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int quantidadePessoas = 1, idade = 20;
		boolean acompanhado;

		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		System.out.println("Valor de acompanhado = " + acompanhado);

		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem Vindo");
		} else {
			System.out.println("Você não pode entrar!");
		}

	}

}
