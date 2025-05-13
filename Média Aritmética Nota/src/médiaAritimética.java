import javax.swing.JOptionPane;
public class médiaAritimética {
    public static void main(String [] args) {
        double n1, n2, n3;
        double media;
        n1=Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da primeira prova"));
        n2=Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da segunda prova"));
        n3=Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do trabalho"));
        media=(n1*30)+(n2*30)+(n3*40)/100;
        JOptionPane.showMessageDialog(null,media);
        if (media >= 7) {
            JOptionPane.showMessageDialog(null,"Aprovado");
        } else {
            JOptionPane.showMessageDialog(null,"Reprovado");
        }
    }
}
