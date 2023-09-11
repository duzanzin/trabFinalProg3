package sistemaBanco.verificar;

public class validaDados {

    public static boolean validaCPF(String cpf) {

        return true;
    }

    public static boolean validarValor(double valor) {
        return valor >= 0;
    }

    public static boolean validaSenha(int senha) {
        return String.valueOf(senha).length() == 4;
    }
}



