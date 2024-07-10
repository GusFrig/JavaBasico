package src.repetição;

public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"Carlos", "fernando", "Gustavo", "Márcia"};

        for( int x=0; x < alunos.length; x++){
            System.out.println("o aluno no índice x=" + x +"é: " + alunos[x]);
        }

    }
}
