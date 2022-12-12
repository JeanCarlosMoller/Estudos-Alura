public class Conta {
    double saldo;
    int agencia, numero;
    String titular;
    String cpf;
    String profissao;
    

    void deposita(double valor) {
        //this é a conta no qual eu estou invocando, não é necessário, mas é recomendado.
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }

    } 
}