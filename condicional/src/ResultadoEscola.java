import java.util.Scanner;
public class ResultadoEscola {
    public static Scanner leia = new Scanner(System.in);
    public static void main(String[] args) {
        int nota = 6;

        if( nota  >= 7)
        {
            System.out.println("Aprovado");      
        }else
        {
            System.out.println("Reprovado");
        }
        
    }
}
