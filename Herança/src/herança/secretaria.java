
package herança;

public class secretaria extends funcionario {
    int ramal, numeroAtendimento;
    
    void ExibirDadosSecretaria() {
        System.out.println("#### Dados Secretario ####");
        System.out.println("Ramal: " + ramal);
        System.out.println("Numero de Atendimento: " + numeroAtendimento);
    }
    
}