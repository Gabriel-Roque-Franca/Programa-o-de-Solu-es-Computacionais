package SintaxeDeClasse;

public class Professor {

    // Atributos
    String nome, materia, formacao, anoDeCarreira;

    // Métodos
    // Métodos Apresentar
    void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Matéria: " + materia);
        System.out.println("Formação: " + formacao);
        System.out.println("Anos de Carreira: " + anoDeCarreira);
    }

    public static void main(String[] args) {

        // Cria um Objeto professor
        Professor prof = new Professor();

        // Define os dados do professor
        prof.nome = "Evandro";
        prof.materia = "História";
        prof.formacao = "Mestrado";
        prof.anoDeCarreira = "4 anos";

        // Imprime os dados
        prof.apresentar();
    }

}
