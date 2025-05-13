import javax.swing.JOptionPane;
public class notaMédia {
    public static void main(String [] args) {
        //Média das notas da USJT
        double n1, n2, n3;
        double media;
        n1=Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da primeira prova"));
        n2=Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da segunda prova"));
        n3=Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do trabalho"));
        media=((n1*3)+(n2*3)+(n3*4))/10;
        JOptionPane.showMessageDialog(null,media);
        if (media >= 7) {
            JOptionPane.showMessageDialog(null,"Aprovado");
        } else {
            JOptionPane.showMessageDialog(null,"Reprovado");
        }
    }
}