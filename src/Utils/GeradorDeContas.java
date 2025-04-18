package Utils;

import java.util.Random;

public class GeradorDeContas {
    public static String gerarNumeroDeConta(String tipoDeConta) {
        int defaultSize = 5;
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < defaultSize; i++) {
            sb.append(random.nextInt(10));
        }
        if (tipoDeConta.equals("CC")) {
            return "CC-" + sb.toString() + "-02";
        }
        return "CP-" + sb.toString() + "-13";

    }
}
