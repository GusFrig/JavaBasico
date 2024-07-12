package src.condicional;
import java.util.Scanner;
public class SenhaValidacao {
    public static Scanner leia = new Scanner(System.in);
    public static void main(String[] args) {
        int senha;
        System.out.println("Digite a senha correta!");
            senha = leia.nextInt();
        if (!(senha == 1234)) {
            while (!(senha == 1234)) {
                System.out.println("senha incorreta! Digite novamente");
                senha = leia.nextInt();
            }
            System.out.println("senha correta");
        } else {
           
            System.out.println("parabéns! senha correta");
        }


        

        
    }
}
