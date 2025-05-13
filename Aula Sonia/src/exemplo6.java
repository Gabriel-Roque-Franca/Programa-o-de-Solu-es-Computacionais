import javax.swing.JOptionPane;
public class exemplo6 {
    public static void main(String[] args) {
        String a,b;
        float x,y,res;
        a = JOptionPane.showInputDialog("Digite o primeiro número: ");
        x = Float.parseFloat(a);
        b = JOptionPane.showInputDialog("Digite o segundo número: ");
        y = Float.parseFloat(b);
        res = (x+y);
        System.out.print(res);
        JOptionPane.showMessageDialog(null, "Resultado da soma: " +res);
        res = (x-y);
        System.out.print(res);
        JOptionPane.showMessageDialog(null, "Resultado da subtração: " +res);
    }
    
}
