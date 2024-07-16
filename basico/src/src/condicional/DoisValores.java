package src.condicional;
import java.util.Scanner;
public class DoisValores {
    public static Scanner leia = new Scanner(System.in);
    public static void main(String[] args) {
        int num1;
        int num2;
    System.out.println("Digite os valores do primeiro e do segundo número(respectivamente)");
    num1 = leia.nextInt();
    num2 = leia.nextInt();
    if( num1 > num2 )
    {
        System.out.println("O maior valor é: " + num1);

    }
    else
    {
        System.out.println("O maior valor é:" + num2);
    }
    }
}
