import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("DIgite o valor de entrada: ");
        double valor1 = scanner.nextDouble();
        
        if (valor1 >= 200) {
            double desconto = valor1 * 0.1;
            //abreviação para valor = valor1 - desconto
            valor1 -= desconto;
            
            System.out.print("O seu desconto é de " + desconto + "\n O valor final e de: " + valor1);
        }
        
    }
    
}
