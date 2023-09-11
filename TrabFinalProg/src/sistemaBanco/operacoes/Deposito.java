package sistemaBanco.operacoes;

import sistemaBanco.conta.Conta;

public class Deposito {

    public static boolean efetuarDeposito(Conta conta, double valor, int senha) {

        if(conta.getsenha() == senha && valor > 0) {

            conta.setSaldo(conta.getSaldo() + valor);

            return true;
        }

        return false;
    }
}
