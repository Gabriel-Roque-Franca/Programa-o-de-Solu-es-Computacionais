
package SintaxeHerança;

public class Funcionario {
    String nome, endereco;
    int idade;
    
    void exibirDados() {
        System.out.println("##### Dados Funcionario #####");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Idade: " + idade + " anos");
    }
}
