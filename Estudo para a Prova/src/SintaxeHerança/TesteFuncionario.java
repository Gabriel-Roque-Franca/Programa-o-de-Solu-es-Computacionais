
package SintaxeHerança;

public class TesteFuncionario {
    public static void main(String[] args) {
        //extanciar
        Funcionario f1 = new Funcionario();
        Gerente g1 = new Gerente();
        Secretaria s1 = new Secretaria();
        
        f1.nome = "Gabriel";
        f1.idade = 18;
        f1.endereco = "Paulista";
        
        g1.nome = "Pedro";
        g1.idade = 24;
        g1.endereco = "Paulista";
        g1.areaDeDepartamento = "RH";
        g1.salario = 2000;
        g1.usuario = "PedroRH";
        g1.senha = "Pedro123";
        
        s1.nome = "Giulia";
        s1.idade = 18;
        s1.endereco = "Tatuapé";
        s1.email = "secretaria@gmail.com";
        s1.telefone = ("(11) 1234-5678");
        
        f1.exibirDados();
        g1.exibirDados();
        s1.exibirDados();
        g1.exibirDadosGerente();
        s1.exibirDadosSecretaria();
    }
    
}
