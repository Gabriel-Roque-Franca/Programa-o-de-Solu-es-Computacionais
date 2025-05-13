import java.util.Scanner;
public class calculadora2 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in); 
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int num6;
        
        System.out.print("Digite o primeiro número: ");
        num1=entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        num2=entrada.nextInt ();
        System.out.println();
        System.out.println(num1+" + "+ num2+" = " +(num1+num2));
        System.out.println();
        
        System.out.print("Digite o primeiro número: ");
        num3=entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        num4=entrada.nextInt();
        System.out.println();
        System.out.println(num3+ " - "+ num4+" = "+(num3-num4));
        System.out.println();
        
        System.out.print("Digite o primeiro número: ");
        num5=entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        num6=entrada.nextInt();
        System.out.println();
        System.out.println(num5+" x "+ num6+" = "+(num5*num6));
    }
    
}
