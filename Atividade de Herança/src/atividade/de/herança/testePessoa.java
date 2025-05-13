
package atividade.de.herança;

public class testePessoa {
    public static void main(String[] args) {
        pessoa p1 = new pessoa();
        aluno a1 = new aluno();
        
        p1.nome = "Gabriel";
        p1.idade = 18;
        
        a1.nome = "Gabriel";
        a1.idade = 18;
        a1.curso = "Ciência da Computação";
        a1.disciplina = "PSC";
        a1.numeroMatricula = 123;
        a1.nota1 = 7;
        a1.nota2 = 8;
        
        a1.DadosAluno();
        
    }
    
}
