import java.util.Scanner;
public class exemplo5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade;
        String nome;
        System.out.println("Digite seu nome: ");
        nome = ler.next();
        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();
        System.out.println("Seu nome = " +nome+"\n");
        // "\n" pular uma linha
        System.out.println("Sua idade = " + idade);
    }
    
}
