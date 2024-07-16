package src.condicional;
import java.util.Scanner;
public class PrecoMaca {
    public static Scanner leia = new Scanner(System.in);
    public static void main(String[] args) {
        int maca;
        double soma;

        System.out.println("Quantas maçãs você deseja?");
        maca = leia.nextInt();

        if (maca >= 12) {
            soma = maca * 0.25;
            System.out.println("Cada maça saiu por: 0,25 R$, o valor final é: " + soma);
        } else {
            soma = maca * 0.30;
            System.out.println("Cada maça saiu por: 0,30 R$, o valor final é: " + soma);

        }
    }
}
