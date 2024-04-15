import java.util.Random;

    public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do{
            System.out.println("Telefone tocando");
        }while (tocando());

        System.out.println("Alô?");
    }

    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;

        // String traduzir = "Sim";

        // if (atendeu == true)
        //     traduzir = "Sim";
        // else
        //     traduzir = "Não";
        // System.out.println("Atendeu? " +traduzir);


        System.out.println("Atendeu? " +atendeu);
        return !atendeu;

    }

}
