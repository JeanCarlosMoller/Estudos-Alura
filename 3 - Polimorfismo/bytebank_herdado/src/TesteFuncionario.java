public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Jean Carlos Möller");
        funcionario.setCpf("111.222.333-44");
        funcionario.setSalario(2600.00);

        System.out.println("Nome Funcionário: " + funcionario.getNome() + "\n" +
                "Bonificação: " + funcionario.getBonificacao());
    }

}
