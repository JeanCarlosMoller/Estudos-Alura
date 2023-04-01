public class TestaGetSet {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);

        System.out.println(conta.getNumero());

        Cliente moller = new Cliente();
        moller.setNome("Jean Carlos Möller");

        conta.setTitular(moller);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("programador");

        System.out.println(conta.getTitular());

    }

}
