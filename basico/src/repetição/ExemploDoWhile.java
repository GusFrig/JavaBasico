package src.repetição;
import java.util.Random;
public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("discando...");
        do {
            System.out.println("tocando...");
        } while (tocando());
    }
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu ? " + atendeu);
        return ! atendeu;
    }
}
