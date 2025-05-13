//Calculadora
import javax.swing.JOptionPane;
public class calculadora {
    public static void main(String[] args) {
        //Qual sera a operação escolhida
        double qualOperação;
        //Tipos de operações matematicas
        double somar, subtrair, multiplicar, dividir;
        //O primeiro e o segundo valor
        double valor1, valor2;
        //Dialogo para saber qual operação o usuario deseja fazer
        qualOperação=Double.parseDouble(JOptionPane.showInputDialog("Qual operação você deseja realiza?  [1]Somar  [2]Subtrair  [3]Multiplicar  [4]Dividir"));
        //Se o usuario escolher uma operação que não está valida
        if (qualOperação > 4) {
            JOptionPane.showMessageDialog(null,"Essa operação está invalida");
                              } else if (qualOperação==1) {
                                  //Operação de somar
                                   valor1=Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor: "));
                                   valor2=Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor: "));
                                   somar=valor1+valor2;
                                   JOptionPane.showMessageDialog(null,+valor1+ "+" +valor2+ "=" +somar);
                                                          } else if (qualOperação==2) {
                                          //Operação de subtrair
                                          valor1=Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor: "));
                                          valor2=Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor: "));
                                          subtrair=valor1-valor2;
                                          JOptionPane.showMessageDialog(null,+valor1+ "-" +valor2+ "=" +subtrair);
                                                                                      } else if (qualOperação==3) {
                                          //Operaçãp de multiplicar
                                          valor1=Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor: "));
                                          valor2=Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor: "));
                                          multiplicar=valor1*valor2;
                                          JOptionPane.showMessageDialog(null,+valor1+ "x" +valor2+ "=" +multiplicar);
                                                                                      } else if (qualOperação==4) {
                                          valor1=Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor: "));
                                          valor2=Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor: "));
                                          dividir=valor1/valor2;
                                          JOptionPane.showMessageDialog(null,+valor1+ "/" +valor2+ "=" +dividir);
                                                                                                                  }
    }
    
}
