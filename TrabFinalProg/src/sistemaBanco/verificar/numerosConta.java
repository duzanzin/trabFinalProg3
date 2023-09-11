package sistemaBanco.verificar;

import java.util.Random;

public class numerosConta {

    private static final Random aleatorio = new Random();

    public static int geradorDeNumero() {
        return 100000 + aleatorio.nextInt(900000);
    }
}

