
package herança;

public class testeFuncionario {
    public static void main(String[] args) {
        //extanciar
            funcionario f1 = new funcionario();
            gerente g1 = new gerente();
            secretaria s1 = new secretaria();
            professor p1 = new professor();
            
            f1.nome = "Rafel";
            f1.endereco = "Avenida Sapopemba 158";
            f1.salario= 1000.00;
            
            g1.nome ="Bruno";
            g1.areaDepartamento ="TI";
            g1.endereco ="Av. Anhaia Melo 500";
            g1.salario = 2000.00;
            g1.senha ="bruno123";
            g1.usuario ="Gerente Bruno";
            
            s1.nome ="Maria";
            s1.endereco ="Av. Estado 10";
            s1.salario = 1000.00;
            s1.numeroAtendimento = 123;
            s1.ramal = 22;
            
            p1.nome ="Eduardo";
            p1.endereco ="Rua Gomes 21";
            p1.salario = 1200.00;
            p1.disciplina ="Ensinando Java";
            p1.titulacao ="Doutorado";
            
            f1.exibirDados();
            g1.exibirDados();
            s1.exibirDados();
            p1.exibirDados();
            g1.exibirDadosGerencia();
            s1.ExibirDadosSecretaria();
            p1.ExibirDadosProfessor();
            
    }    
    
}