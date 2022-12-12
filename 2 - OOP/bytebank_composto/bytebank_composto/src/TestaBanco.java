public class TestaBanco {
    public static void main(String[] args) {
        Cliente moller = new Cliente();
        moller.nome = "Jean Carlos Möller";
        moller.cpf = "111.111.111-11";
        moller.profissao = "Programador";

        Conta contaDoMoller = new Conta();
        contaDoMoller.deposita(100);

        // associa o cliente Möller a conta contaDoMoller
        contaDoMoller.titular = moller;
        System.out.println(contaDoMoller.titular.nome);
    }

}
