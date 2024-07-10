package src.condicional;
public class SistemaDeMedida {
    public static void main(String[] args) {
        String sigla = "m";

        switch (sigla) {
            case "G":
                System.out.println("grande");
            break;
            case "M" :
                System.out.println("Médio");
            break;
            case "P" :
            System.out.println("Pequeno");
            break;

            default: 
            System.out.println("Valor indefinido");
            break;
        }
    }
}
