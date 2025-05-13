
package SintaxeHerança;

//extends funcionario (secretaria é filho de funcionario)
public class Secretaria extends Funcionario {
    String email, telefone;
    
    void exibirDadosSecretaria() {
        System.out.println("##### Dados Secretaria #####");
        System.out.println("E-mail: " + email);
        System.out.println("Telefone: " + telefone);
    }
    
    
}
