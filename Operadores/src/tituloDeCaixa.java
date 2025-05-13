import javax.swing.JOptionPane;

public class tituloDeCaixa {

    public static void main(String[] args) {
        double area = 0, lado, raio, base, altura; // Inicializei area com 0
        String[] opcoes = {"Área do círculo", "Área do quadrado", "Área do triângulo"}; // Opções corrigidas
        String escolha = (String) JOptionPane.showInputDialog(
                null,
                "Escolha uma opção:",
                "Título da Caixa",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]);

        if (escolha != null) {
            if (escolha.equals("Área do círculo")) { // Usando equals para comparar Strings
                raio = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do raio: "));
                area = Math.PI * Math.pow(raio, 2);
                JOptionPane.showMessageDialog(null, "A área do círculo é " + area + " u2");
            } else if (escolha.equals("Área do quadrado")) { // Usando equals para comparar Strings
                lado = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do lado: "));
                area = Math.pow(lado, 2);
                JOptionPane.showMessageDialog(null, "A área do quadrado é " + area + " u2");
            } else if (escolha.equals("Área do triângulo")) { // Usando equals para comparar Strings
                base = Double.parseDouble(JOptionPane.showInputDialog("Insira a base: "));
                altura = Double.parseDouble(JOptionPane.showInputDialog("Insira a altura: "));
                area = (base * altura) / 2;
                JOptionPane.showMessageDialog(null, "A área do triângulo é " + area + " u2");
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma opção selecionada.");
        }

    }
}