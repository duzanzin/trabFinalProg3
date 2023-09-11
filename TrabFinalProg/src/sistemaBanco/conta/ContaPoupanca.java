package sistemaBanco.conta;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Object cliente, int agencia, int senha) {
        super(cliente, agencia, senha);
    }


    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do saque deve ser positivo");
        }
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        this.saldo -= valor;
    }
}
