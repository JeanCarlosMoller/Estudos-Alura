public class CriarConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);
        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 300;

        primeiraConta.agencia = 146;
        System.out.println("Primeira conta tem " + primeiraConta.saldo + " reais.");
        System.out.println("Segunda conta tem " + segundaConta.saldo + " reais.");

        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);

        segundaConta.agencia = 146;
        System.out.println("agora a segunda conta está na agencioa " + segundaConta.agencia);

        //comparação de referencia
        if(primeiraConta == segundaConta){
            System.out.println("mesma conta");
        } else {
            System.out.println("Contas diferentes");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);


    }
}
