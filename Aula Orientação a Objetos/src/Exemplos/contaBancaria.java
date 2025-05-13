
package Exemplos;

import javax.swing.JOptionPane;
import java.text.DecimalFormat; // importação de biblioteca usada para formatar números decimais

public class contaBancaria {
    String nome, cpf;
    double saldo, valorSacar, limite;
    int numeroConta, opcao;
    
    public static void main(String[] args) {
        contaBancaria conta1 = new contaBancaria();
        conta1.nome = JOptionPane.showInputDialog("Digite o seu nome completo: ");
        conta1.cpf = JOptionPane.showInputDialog("Digite o seu CPF (Apenas os números): ");
        
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n1-Depositar \n2- Sacar \n3-Extrato \n4-Consultar saldo \n0-Sair"));
            
        }
    }
    
}
