package construtores.entities;

public class Conta {

    private int conta;
    private String titular;
    private double saldo;

    public Conta(int conta, String titular, double depositoInicial) {
        this.conta = conta;
        this.titular = titular;
        /*Ao usar o método deposit() no construtor, você centraliza toda a lógica de manipulação do saldo, tornando a manutenção muito mais fácil.
        Se a regra de negócio mudar, você só precisa modificar o método deposit(), evitando a modificação de vários pontos no código.
         */
        deposito(depositoInicial);
    }

    public Conta(int conta, String titular) {
        this.conta = conta;
        this.titular = titular;
    }

    public int getConta() {
        return conta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void deposito(double valorDepositado){

        saldo += valorDepositado;
    }

    public void saque(double valorSaque){

        double taxa = 5.00;
        saldo = (saldo - valorSaque) - taxa;

    }

    @Override
    public String toString() {
        return  "Account " + conta +
                ", Holder: " + titular +
                ", Balance: $ " + String.format("%.2f", saldo);
    }
}
