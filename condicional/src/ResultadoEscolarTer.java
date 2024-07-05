
public class ResultadoEscolarTer {
public static void main(String[] args) {
    int nota = 6;
    String resultado = nota>=7 ? "aprovado": nota >= 5 && nota < 7 ? "Recuperação": "Reprovado";
    System.out.println(resultado);
} 
    
}