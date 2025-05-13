import javax.swing.JOptionPane;
public class qualArea {
  public static void main(String[] args) {
      //qualArea é usado para perguntar a area de qual forma geometrica o usuario quer descobrir
      double qualArea;
      double area1, area2, area3;
      //os valores necessarios para descobrir a area das formas geometricas
      double raio, base, altura, lado;
      qualArea=Double.parseDouble(JOptionPane.showInputDialog("Qual area você quer saber?  [1] Circulo, [2] Triangulo, [3] Quadrado: "));
      //Area do Circulo
      if (qualArea == 1) {
          raio=Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do raio: "));
          area1=3.14*(Math.pow (raio,2));
          JOptionPane.showMessageDialog(null,"A area do Circulo e " +area1);
                         }
      //Area do Triangulo
      if (qualArea == 2) {
          base=Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da base: "));
          altura=Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da altura: "));
          area2=(base*altura/2);
          JOptionPane.showMessageDialog(null,"A area do Triangulo e " +area2);
                         }
      //Area do Quadrado
      if (qualArea == 3) {
          lado=Double.parseDouble(JOptionPane.showInputDialog("Qual o valor dos lados: "));
          area3=(Math.pow (lado,2));
          JOptionPane.showMessageDialog(null,"A area do Quadrado e " +area3);
                         }
  } 
}
