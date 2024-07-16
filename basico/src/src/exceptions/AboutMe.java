package src.exceptions;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) {
        try{
       
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


     System.out.println("digite seu nome");
     String nome = scanner.next();

     System.out.println("digite seu sobrenome");
     String sobrenome = scanner.next();

     System.out.println("digite sua idade");
     int idade = scanner.nextInt();

     System.out.println("digite sua altura");
     Double altura = scanner.nextDouble();
     


     System.out.println("olá, me chamo: " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
     System.out.println("tenho " + idade + " anos ");
     System.out.println("minha altura é: " + altura + "cm ");
     scanner.close();
        } catch (InputMismatchException e){
            System.out.println("OS campos idade e altura precisam ser numéricos!");
        }
        
   
    }
}
