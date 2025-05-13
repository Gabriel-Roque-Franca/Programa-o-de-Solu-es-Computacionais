
package SintaxeHerança;

//extends funcionario (gerente é filho de funcionario)
public class Gerente extends Funcionario {
    double salario;
    String usuario, senha, areaDeDepartamento;
    
    void exibirDadosGerente() {
        System.out.println("##### Dados Gerente #####");
        System.out.println("Salario: " + salario);
        System.out.println("Usuario: " + usuario);
        System.out.println("Senha: " + senha);
        System.out.println("Departamento: " + areaDeDepartamento);
    }
    
}
