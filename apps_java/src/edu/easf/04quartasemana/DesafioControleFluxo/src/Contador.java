import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Digite o primeiro parâmetro: ");
            int parametroUm = scanner.nextInt();
            
            System.out.print("Digite o segundo parâmetro: ");
            int parametroDois = scanner.nextInt();
		
            try {
                //chamando o método contendo a lógica de contagem
                int contagem = contar(parametroUm, parametroDois);
                System.out.println(contagem);
                for (int i = 1; i <= contagem; i++){
                    System.out.println("Imprimindo o número " +i);
                }
            } catch (ParametrosInvalidosException e) {
                //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                System.out.println("O parâmetro um deve ser menor que o parâmetro dois.");
            }
            
            scanner.close();
        }

        static int contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
            //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
            if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException();
            int contagem = (parametroDois - parametroUm);
            System.out.print("Diferença: ");
            return contagem;
            }
                    
}
