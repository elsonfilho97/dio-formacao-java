public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 10;

        // if(nota >= 7)
        // System.out.println("Aprovado");

        // else if(nota >=5 && nota < 7)
        // System.out.println("Recuperação");

        // else
        // System.out.println("Reprovado");

        int resultado = nota >= 7 ? 10 : nota >= 5 && nota < 7 ? 20:30;
        System.out.println(resultado);

    }
}
