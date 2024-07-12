package src.repetição;
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50;
        // enquanto o valor da mesa for maior que 0, as operações de validação vão ocorrer
        while (mesada > 0) {
            // Valor do doce recebe o método que apresenta valores aleatórios para a variável valorDoce
            double valorDoce = valorAleatorio();
            //Se o valor do doce for igual ao valor da mesada, significa que a expressçao está próxima de acabar. Por isso, é feita uma validação afim de extinguir o valor da mesada, além de facilitar o processo de análise e bom fucionamento do código
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }
            //A validação,esta será feita enquanto o valor da mesada for maior que zero 
            System.out.println("Doce de valor: " + valorDoce + "adicionado ao carrinho");
            mesada = mesada- valorDoce;
        }
        System.out.println("mesada: " + mesada);
    }
    //Método para apresentação de valores aleatórios
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
