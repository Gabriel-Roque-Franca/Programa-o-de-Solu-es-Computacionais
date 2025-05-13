package SintaxeDeClasse;

import java.util.Scanner;

public class PessoaScanner {

    // Atributos
    String nome, sexo, faixa;
    byte idade;

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
        Scanner scanner = new Scanner(System.in);
        PessoaScanner p = new PessoaScanner(); 

        System.out.print("Digite o seu nome: ");
        p.nome = scanner.nextLine();

        System.out.print("Digite a sua idade: ");
        p.idade = scanner.nextByte();
        scanner.nextLine(); 

        System.out.print("Digite o seu sexo: ");
        p.sexo = scanner.nextLine();

        p.Classificar(); 
        p.Imprimir();

        scanner.close();
    }

}
