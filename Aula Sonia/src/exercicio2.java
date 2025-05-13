import javax.swing.JOptionPane;

public class exercicio2 {
    public static void main(String[] args) {
        // Entrada com JOptionPane
        String input = JOptionPane.showInputDialog("Digite o preço do artigo:");
        double preco = Double.parseDouble(input);
        double desconto;

        // Estrutura if encadeada
        if (preco > 10000) {
            desconto = 0.40;
        } else if (preco > 5000) {
            desconto = 0.20;
        } else if (preco > 2500) {
            desconto = 0.10;
        } else {
            desconto = 0.05;
        }

        double valorComDesconto = preco - (preco * desconto);

        // Saída com JOptionPane
        String mensagem = String.format("Desconto aplicado: %.0f%%\nValor com desconto: R$ %.2f", 
                                         desconto * 100, valorComDesconto);
        JOptionPane.showMessageDialog(null, mensagem);
    }
}

