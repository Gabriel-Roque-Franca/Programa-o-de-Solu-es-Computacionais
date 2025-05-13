package SintaxeDeClasse;

import java.util.Scanner; // Importar a classe Scanner

public class AlunoScanner {

    // Atributos
    String nome, curso, semestre;
    byte idade;
    double nota1, nota2, nota3, media;

    // Métodos
    // Método Apresentar
    void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Curso: " + curso);
        System.out.println("Semestre: " + semestre);
    }

    // Método Calcular a Nota
    void calcularNota() {
        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Media: " + media);
        if (media >= 7) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um Scanner para ler do teclado
        AlunoScanner aluno01 = new AlunoScanner();

        System.out.print("Digite o nome do aluno: ");
        aluno01.nome = scanner.nextLine(); // Lê o nome (String)

        System.out.print("Digite a idade do aluno: ");
        aluno01.idade = scanner.nextByte(); // Lê a idade (byte)
        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.print("Digite o curso do aluno: ");
        aluno01.curso = scanner.nextLine(); // Lê o curso (String)

        System.out.print("Digite o semestre do aluno: ");
        aluno01.semestre = scanner.nextLine(); // Lê o semestre (String)

        System.out.print("Digite a nota 1: ");
        aluno01.nota1 = scanner.nextDouble(); // Lê a nota 1 (double)
        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.print("Digite a nota 2: ");
        aluno01.nota2 = scanner.nextDouble(); // Lê a nota 2 (double)
        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.print("Digite a nota 3: ");
        aluno01.nota3 = scanner.nextDouble(); // Lê a nota 3 (double)
        scanner.nextLine(); // Consumir a quebra de linha pendente

        aluno01.apresentar();
        aluno01.calcularNota();

        scanner.close(); // Fecha o Scanner (boa prática)
    }

}
