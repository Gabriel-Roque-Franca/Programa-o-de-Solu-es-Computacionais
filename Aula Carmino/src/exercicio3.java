import javax.swing.JOptionPane;
public class exercicio3 {
    public static void main(String[] args) {
        double peso, altura, imc;
        peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu peso: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a sua altura: "));
        
        imc = (peso/(altura * altura));
        if (imc >= 30.0) {
            JOptionPane.showMessageDialog(null, "Obesidade");
        }
    }
    
}
