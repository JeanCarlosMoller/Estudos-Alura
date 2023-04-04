package estudos_de_sintaxe_variaveis_fluxos;

public class Testavalores {

	public static void main(String[] args) {
		int primeiroNum = 5, segundoNum = 7;
		
		segundoNum = primeiroNum;
		
		primeiroNum = 10;
		
		System.out.println(segundoNum);
	}
}
