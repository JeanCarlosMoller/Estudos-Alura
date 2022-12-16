public class TesteGerente {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente();
        gerente1.setNome("Ronaldo");
        gerente1.setCpf("111.222.333-55");
        gerente1.setSalario(5000.0);
        gerente1.setSenha(2222);

        System.out.println("---------Informações Gerente---------" + "\n" +
                "Nome Gerente    : " + gerente1.getNome() + "\n" +
                "CPF Gerente     : " + gerente1.getCpf() + "\n" +
                "Salário Gerente : " + gerente1.getSalario() + "\n" +
                "-------------------------------------");

        boolean autentica = gerente1.autentica(2222);
        System.out.println(autentica);

        System.out.println(gerente1.getBonificacao());
    }

}
