
package herança;

public class professor extends funcionario {
    String titulacao, disciplina;
    
    void ExibirDadosProfessor() {
        System.out.println("#### Dados Professor ####");
        System.out.println("Titulação: " + titulacao);
        System.out.println("Disciplina: " + disciplina);
    }
    
}