import java.util.Scanner;
import java.util.Locale;


public class CaixaEletronico {

    public static void main(String[] args) {
        double saldo = 25.0;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insira o valor a ser sacado:");
        double aSacar = scanner.nextDouble();

        if(aSacar < saldo){
        saldo = saldo - aSacar;
        System.out.println("Saque realizado! Saldo atual: R$" +saldo);}

        else
        System.out.println("Saldo insuficiente para esta operação.");


    }
    
}