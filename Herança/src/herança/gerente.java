
package herança;

//extends funcionario (gerente é filho de funcionario)
public class gerente extends funcionario {
    String areaDepartamento, usuario, senha;
    
    void exibirDadosGerencia() {
        System.out.println("#### Dados Gerencia ####");
        System.out.println("Area: " + areaDepartamento);
        System.out.println("Usuario: " + usuario);
        System.out.println("Senha: " + senha);
    }
}
