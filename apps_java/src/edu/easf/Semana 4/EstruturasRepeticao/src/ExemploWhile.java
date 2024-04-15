import java.util.concurrent.*;

public class ExemploWhile {

    public static void main(String[] args) {
        double mesada = 50;
        int x = 0;
        while (mesada>0){
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada){
                valorDoce = mesada;
            }
        mesada = mesada - valorDoce;
        System.out.println("Valor do doce: R$ " +valorDoce);
        System.out.println("Saldo restante: R$ " +mesada);
        x++;
        }

        System.out.println("Joãozinho comprou "+x+" doces.");
    }

    

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);}

}



