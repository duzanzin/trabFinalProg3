package sistemaBanco.operacoes;

import sistemaBanco.conta.Conta;

public class Saque {
    public static boolean efetuarSaque(Conta conta, double valor, int senha) {

        if (Conta.getSenha() == senha && valor > 0 && conta.getSaldo() >= valor) {

            conta.setSaldo(conta.getSaldo() - valor);
            return true;
        }
        return false;
    }
}
