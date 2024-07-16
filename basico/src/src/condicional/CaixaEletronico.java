package src.condicional;
public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25;
        double valorSolicitado = 26;
        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println(" o novo saldo é: " + saldo );
        }else{
            System.out.println("saldo insuficiente");
        }
        System.out.println(saldo);
    }
}
