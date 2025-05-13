
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class numerosDecimais {

    public static void main(String[] args) {
        // Declarando as variáveis
        float valor1, valor2, soma;

        // Formato para evitar casas decimais desnecessárias
        DecimalFormat formatador = new DecimalFormat("#.##");

        // Pergunta ao usuário qual operação deseja realizar
        int qualOperacao = Integer.parseInt(JOptionPane.showInputDialog("Qual operação você deseja realizar? (1 para soma)"));

        // Operação de soma
        if (qualOperacao == 1) {
            valor1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o primeiro valor: "));
            valor2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o segundo valor: "));

            soma = valor1 + valor2;

            // Exibir sem casas decimais se for inteiro, ou com casas se necessário
            String resultadoFormatado = formatador.format(soma);

            JOptionPane.showMessageDialog(null, formatador.format(valor1) + " + " + formatador.format(valor2) + " = " + resultadoFormatado);
        }
    }
}
