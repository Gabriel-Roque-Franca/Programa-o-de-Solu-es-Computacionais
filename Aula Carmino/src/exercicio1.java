
import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num1;
        
        System.out.println("Digite o numero: ");
        num1 = entrada.nextInt();
        
        if (num1 > 0) {
            System.out.print(num1 + " e Positivo ");
        } else if (num1 < 0) {
            System.out.print (num1 + " e Negativo ");
        } else {
        System.out.print (num1 + " e Nulo ");
    }
    }

}
