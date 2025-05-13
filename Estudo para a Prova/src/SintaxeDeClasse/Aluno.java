package SintaxeDeClasse;

public class Aluno {

    // Atributos
    String nome, curso, semestre;
    byte idade;
    double nota1, nota2, nota3, media;

    // Métodos
    // Método Apresentar
    void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println("Semestre: " + semestre);
    }

    // Método Calcular a Nota
    void calcularNota() {
        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Media: " + media);
        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }

    public static void main(String[] args) {
        Aluno aluno01 = new Aluno(); // Cria um Objeto aluno

        // Define os dados do aluno
        aluno01.nome = "Gabriel Roque";
        aluno01.idade = 18;
        aluno01.curso = "Ciência da Computação";
        aluno01.semestre = "Primeiro";
        aluno01.nota1 = 7;
        aluno01.nota2 = 7;
        aluno01.nota3 = 7;

        aluno01.apresentar(); // Imprime os dados
        aluno01.calcularNota(); // Imprime o calculo da nota

    }

}
