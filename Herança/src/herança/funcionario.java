
package herança;

public class funcionario {
    
    String nome, endereco;
    double salario;
    
    //exibir dados na tela
    
    void exibirDados() {
        System.out.println("#### Dados ####");
        System.out.println("Nome: " + nome);
        System.out.println("Endereco: " + endereco);
        System.out.println("Salario: " + salario);
    }
    
}