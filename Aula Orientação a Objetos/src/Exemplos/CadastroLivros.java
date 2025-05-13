
package Exemplos;
import javax.swing.JOptionPane;
public class CadastroLivros {
    //Declaração dos atributos
    String nome, descricao, isbn;
    double valor;
        
    public static void main(String[] args) { // Adicionado o método main para executar o código
        CadastroLivros livro1 = new CadastroLivros();
        livro1.nome="Java";
        livro1.descricao="Novos recursos para a linguagem";
        livro1.valor=120.00;
        livro1.isbn="956-99-789-987";
    
        livro1.mostrarDetalhes();
    }
    
    //Declaração dos métodos da classe
    void mostrarDetalhes(){
        //implementação do método
        JOptionPane.showMessageDialog(null, "Mostrar detalhes do livro \nNome do livro: " + this.nome + "\nDescrição: " + this.descricao + "\nValor: " + this.valor + "R$ \nISBN: " + this.isbn);

    }
}
