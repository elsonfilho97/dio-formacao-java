import java.util.Scanner;

public class PedraPapelAtaqueAereo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            
            
            int N = scanner.nextInt();

            for (int i= 0; i < N; i++){
            
                String jogador1 = scanner.next();
                String jogador2 = scanner.next();            
                    
                
                // Empates:
                if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("ataque"))
                System.out.println("Aniquilacao Mutua");
                else if (jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("pedra"))
                System.out.println("Sem ganhador");
                else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("papel"))
                System.out.println("Ambos venceram");
                // Vitória do jogador 1:
                else if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("pedra"))
                System.out.println("Jogador 1 venceu");
                else if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("papel"))
                System.out.println("Jogador 1 venceu");
                else if (jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("papel"))
                System.out.println("Jogador 1 venceu");
                // Vitória do jogador 2:
                else if (jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("ataque"))
                System.out.println("Jogador 2 venceu");
                else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("ataque"))
                System.out.println("Jogador 2 venceu");
                else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("pedra"))
                System.out.println("Jogador 2 venceu");

        }
        scanner.close();
     }

}
