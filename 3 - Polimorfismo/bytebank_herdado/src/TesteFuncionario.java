public class TesteFuncionario {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        Gerente funcionario = new Gerente();
        funcionario.setNome("Jean Carlos Möller");
        funcionario.setCpf("111.222.333-44");
        funcionario.setSalario(2600.00);

        System.out.println("Nome Funcionário: " + funcionario.getNome() + "\n" +
                "Bonificação: " + funcionario.getBonificacao());

        // funcionario.salario = 300.0;
    }

}
