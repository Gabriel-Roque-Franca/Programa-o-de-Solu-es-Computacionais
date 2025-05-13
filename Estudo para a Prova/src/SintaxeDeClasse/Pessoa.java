package SintaxeDeClasse;

public class Pessoa {

    // Atributos
    String nome;
    int idade;
    char sexo;
    String faixa;

    // Métodos
    // Método Imprimir
    void Imprimir() {
        System.out.println("-----------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Faixa: " + faixa);
        System.out.println("-----------");
    }

    // Método Classificar
    void Classificar() {
        if (idade < 0) {
            System.out.println("Erro");
        } else if (idade <= 2) {
            faixa = "Bebê";
        } else if (idade <= 11) {
            faixa = "Criança";
        } else if (idade <= 19) {
            faixa = "Adolescente";
        } else if (idade <= 30) {
            faixa = "Jovem";
        } else if (idade <= 60) {
            faixa = "Adulto";
        } else {
            faixa = "Idoso";
        }
    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa(); // Cria um objeto Pessoa

        // Define os dados da pessoa
        p.nome = "Gabriel";
        p.idade = 18;
        p.sexo = 'M';

        p.Classificar(); // Classifica a faixa etária
        p.Imprimir();    // Imprime os dados
    }
}
