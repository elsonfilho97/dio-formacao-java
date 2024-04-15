import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        String nomeCliente = "MARIO ANDRADE";
        double saldo = 237.48;
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número do agência:");
        String conta  = scanner.next();

        System.out.println("Insira o número de sua conta:");
        int agencia = scanner.nextInt();

        System.out.println("Olá, " +nomeCliente+ ", obrigado por criar uma conta em");
        System.out.println("nosso banco, sua agência é " +agencia+ ", e o número da sua conta é o " +String.format(conta)+ ".");
        System.out.println("Seu saldo disponível para saque é de: R$" +saldo);
 
        scanner.close();
    }
}
