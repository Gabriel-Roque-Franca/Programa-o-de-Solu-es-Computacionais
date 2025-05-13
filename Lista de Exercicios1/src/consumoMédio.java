//Consumo médio gasto de um automóvel
import javax.swing.JOptionPane;
public class consumoMédio {
    public static void main(String[] args) {
        //Distancia e a quantidade de Litros de gasolina
        double litros,km;
        double consumoMédio;
        km=Double.parseDouble(JOptionPane.showInputDialog("Quantos Km você vai percorrer: "));
        litros=Double.parseDouble(JOptionPane.showInputDialog("Quantos Litros de Combustível você colocou: "));
        consumoMédio=(km/litros);
        JOptionPane.showMessageDialog(null,"Você percorreu " +km+ "km e colocou " +litros+ " litros de gasolina. O Seu consumo médio foi de " +consumoMédio+ "  litros por km rodados");
    }
    
    
}
