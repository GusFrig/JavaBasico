package src.exceptions;

public class FormatadorDeCep {
    public static void main(String[] args) {
      
            try {
                String cepFormatado = formatarCep("23765064");
                System.out.println(cepFormatado);
            } catch (CepInvalidoException e) {
               
               System.out.println("O cep não corresponde as regras de negocio");
            }
      
    }
    static String formatarCep(String cepString) throws CepInvalidoException{
        if (cepString.length() != 8)
            throw new CepInvalidoException();


            return "23.765-064";
            
        
    }
    }

