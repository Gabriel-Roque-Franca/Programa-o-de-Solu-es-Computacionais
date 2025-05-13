import javax.swing.JOptionPane;
public class if2 {
    public static void main(String[] args){
        double avaliar;
        avaliar=Double.parseDouble(JOptionPane.showInputDialog("Digite o numero"));
        if (avaliar>=80){
            JOptionPane.showMessageDialog(null,"legal");
                        }
        else{
            JOptionPane.showMessageDialog(null,"ruim");
        }
    }
}
