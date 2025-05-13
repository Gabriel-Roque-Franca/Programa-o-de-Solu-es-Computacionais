import java.util.Scanner;
public class OperadoresMatematicos {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int num1 = 7;
        int num2 = 3;
        
        System.out.print("Digite o primeiro numero: ");
        num1=entrada.nextInt();
        System.out.print("Digite o segundo numero: ");
        num2=entrada.nextInt();
        
        System.out.println(num1+ " + " +num2+ " = " +(num1+num2));
        System.out.println(num1+ " - " +num2+ " = " +(num1-num2));
        System.out.println(num1+ " x " +num2+ " = " +(num1*num2));
        System.out.println(num1+ " / " +num2+ " = " +(num1/num2)); //O resto é descartado
    }
    
}
