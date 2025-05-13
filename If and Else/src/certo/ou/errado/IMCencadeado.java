import javax.swing.JOptionPane;
public class IMCencadeado {
    public static void main(String[] args) {
        double peso;
        double altura;
        double imc;
        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso em KG: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura em Metros: "));
        
        imc=(peso/(altura*altura));
        if (imc>=25){
            JOptionPane.showMessageDialog(null,"Porco");
        }
        else if (imc>=20){
            JOptionPane.showMessageDialog(null,"Normal");
        }
        else if (imc<=19){
            JOptionPane.showMessageDialog(null,"Esqueleto");
        }
       
    }
    
}
