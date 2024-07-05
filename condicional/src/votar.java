import java.util.Scanner;
public class votar {
    public static Scanner leia = new Scanner(System.in);
    public static void main(String[] args) {
        int ano;
        
    System.out.println("Informe o seu ano de nascimento");
        ano = leia.nextInt();
        int anodefini = 2024 - ano;
            if (anodefini >= 18) 
            {
                System.out.println("Voto obrigatório");

            } 
            else if( anodefini >= 16 && anodefini < 18 )
            {
                System.out.println("Voto Facultativo"); 
            }
            else if(anodefini < 16)
            {
                System.out.println("Voto não Obrigatório");     
            } 
    }
}
