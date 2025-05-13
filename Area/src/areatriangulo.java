import javax.swing.JOptionPane;
public class areatriangulo {
   public static void main(String[] args){
      //declaração de variavel
      double base, alt, area;
      //inserção de valores
      base=Double.parseDouble(JOptionPane.showInputDialog("Insira a base"));
      alt=Double.parseDouble(JOptionPane.showInputDialog("Isira a altura"));
      //calculo de area
      area=(base*alt)/2;
      //apresentar o resultado
      JOptionPane.showMessageDialog(null, "A area e "+area+"u2");
   }
    
}
