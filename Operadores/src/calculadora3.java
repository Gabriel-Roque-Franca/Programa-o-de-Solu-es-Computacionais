
import javax.swing.JOptionPane;
import java.text.DecimalFormat; // importação de biblioteca usada para formatar números decimais

public class calculadora3 {

    public static void main(String[] args) {

        // Qual sera a operação escolhida
        int qualOperação;
        // Se quiser descobrir a area de uma figura plana
        int qualArea;

        // Tipos de operações matematicas
        double somar, subtrair, multiplicar, dividir;
        //Tipos de figuras planas
        double circulo, triangulo, quadrado, trapézio;
        
        // O primeiro e o segundo valor
        double valor1, valor2;
        // Valores necessario para a Area da figura plana
        double rRaio, bBase, hAltura, lLado, Bmaior, bMenor;

        // Formato para evitar casas decimais desnecessárias
        DecimalFormat formatador = new DecimalFormat("#.##");
        
        // Dialogo para saber qual operação o usuario deseja fazer
        qualOperação = Integer.parseInt(JOptionPane.showInputDialog("Qual operação você deseja realiza? \n [1]Somar  [2]Subtrair  [3]Multiplicar  [4]Dividir  [5]Área de um figura Plana"));
        if (qualOperação > 5) {
            JOptionPane.showMessageDialog(null, "Essa operação está invalida");
        } else if (qualOperação == 1) {
            // Operação de somar
            valor1 = Double.parseDouble(JOptionPane.showInputDialog("Primeiro valor: "));
            valor2 = Double.parseDouble(JOptionPane.showInputDialog("Segundo valor: "));
            somar = valor1 + valor2;
            // Exibir sem casas decimais se for inteiro, ou com casas se necessário
            String resultadoFormatadoSomar = formatador.format(somar);
            JOptionPane.showMessageDialog(null, formatador.format(valor1) + " + " + formatador.format(valor2) + " = " + resultadoFormatadoSomar);
        } else if (qualOperação == 2) {
            // Operação de subtrair
            valor1 = Double.parseDouble(JOptionPane.showInputDialog("Primeiro valor: "));
            valor2 = Double.parseDouble(JOptionPane.showInputDialog("Segundo valor: "));
            subtrair = valor1 - valor2;
            // Exibir sem casas decimais se for inteiro, ou com casas se necessário
            String resultadoFormatadoSubtrair = formatador.format(subtrair);
            JOptionPane.showMessageDialog(null, formatador.format(valor1) + " - " + formatador.format(valor2) + " = " + resultadoFormatadoSubtrair);
        } else if (qualOperação == 3) {
            // Operaçãp de multiplicar
            valor1 = Double.parseDouble(JOptionPane.showInputDialog("Primeiro valor: "));
            valor2 = Double.parseDouble(JOptionPane.showInputDialog("Segundo valor: "));
            multiplicar = valor1 * valor2;
            // Exibir sem casas decimais se for inteiro, ou com casas se necessário
            String resultadoFormatadoMultiplicar = formatador.format(multiplicar);
            JOptionPane.showMessageDialog(null, formatador.format(valor1) + " x " + formatador.format(valor2) + " = " + resultadoFormatadoMultiplicar);
        } else if (qualOperação == 4) {
            // Operação de dividir
            valor1 = Double.parseDouble(JOptionPane.showInputDialog("Primeiro valor: "));
            valor2 = Double.parseDouble(JOptionPane.showInputDialog("Segundo valor: "));
            dividir = valor1 / valor2;
            // Exibir sem casas decimais se for inteiro, ou com casas se necessário
            String resultadoFormatadoDividir = formatador.format(dividir);
            JOptionPane.showMessageDialog(null, formatador.format(valor1) + " / " + formatador.format(valor2) + " = " + resultadoFormatadoDividir);
        } else if (qualOperação == 5) {
            qualArea = Integer.parseInt(JOptionPane.showInputDialog("Qual figura você deseja descobrir a área? \n [1]Circulo  [2]Triangulo  [3]Quadrado  [4]Trapézio"));
            if (qualArea == 1) {
                // Area do circulo
                rRaio = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor do raio: "));
                circulo = 3.14 * (Math.pow(rRaio, 2));
                // Exibir sem casas decimais se for inteiro, ou com casas se necessário
                String resultadoFormatadoCirculo = formatador.format(circulo);
                JOptionPane.showMessageDialog(null, "A Área do circulo é " + resultadoFormatadoCirculo);
            } else if (qualArea == 2) {
                // Area do triangulo
                bBase = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor da base: "));
                hAltura = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor da altura: "));
                triangulo = (bBase * hAltura) / 2;
                // Exibir sem casas decimais se for inteiro, ou com casas se necessário
                String resultadoFormatadoTriangulo = formatador.format(triangulo);
                JOptionPane.showMessageDialog(null, "A Área do triangulo é " + resultadoFormatadoTriangulo);
            } else if (qualArea == 3) {
                // Area do quadrado
                lLado = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor do lado: "));
                quadrado = (Math.pow(lLado, 2));
                // Exibir sem casas decimais se for inteiro, ou com casas se necessário
                String resultadoFormatadoQuadrado = formatador.format(quadrado);
                JOptionPane.showMessageDialog(null, "A Área do quadrado é " + resultadoFormatadoQuadrado);
            } else if (qualArea == 4) {
                // Area do trapézio
                Bmaior = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor da base maior: "));
                bMenor = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor da base menor: "));
                hAltura = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor da altura: "));
                trapézio = ((Bmaior + bMenor) * hAltura) / 2;
                // Exibir sem casas decimais se for inteiro, ou com casas se necessário
                String resultadoFormatadoTrapézio = formatador.format(trapézio);
                JOptionPane.showMessageDialog(null, "A Área do trapézio é " + resultadoFormatadoTrapézio);
            }
        }
    }

}
