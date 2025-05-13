
package atividade.de.herança;

public class aluno extends pessoa {
    int numeroMatricula;
    String curso, disciplina, resultado;
    float nota1, nota2, media;
    
    void DadosAluno() {
        System.out.println("### Dados Aluno ###");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Numero da Matricula: " + numeroMatricula);
        System.out.println("Curso: " + curso);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Nota da A1: " + nota1);
        System.out.println("Nota da A2: " + nota2);
        media = (nota1 + nota2)/2;
        System.out.println("Média: " + media);
        if (media >= 7){
            resultado = "APROVADO";
        } else {
            resultado = "REPROVADO";
        } 
        System.out.println(resultado);
    
    }
    
}
