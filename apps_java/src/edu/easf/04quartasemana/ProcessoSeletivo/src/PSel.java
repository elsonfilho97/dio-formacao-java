import java.util.Random;
import java.util.concurrent.*;

public class PSel {

    public static void main(String[] args) {
        String [] candidatosSelecionados = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
            
            selecaoCandidatos(candidatosSelecionados);
        for (String candidato:candidatosSelecionados){
            entrandoEmContato(candidato);
            }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            } while(continuarTentando && tentativasRealizadas < 3);

            if(atendeu)
                System.out.println("Conseguimos contato com "+candidato+" na " +tentativasRealizadas+ "ª tentativa(s).");
            else
                System.out.println(("Não conseguimos contato com "+candidato+", máximo de tentativas igual a 3."));
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for (int i = 0; i < candidatos.length; i++){
            System.out.println("O candidato selecionedo é " +candidatos[i]+", de nº " +(i+1)+".");
        }
    }

    static void selecaoCandidatos(String [] candidatosSelecionados){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        int nCandidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        
        while((nCandidatosSelecionados < 5) && (candidatoAtual < candidatos.length)){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " +candidato+ " solicitou o valor R$" +salarioPretendido+ " como salário.");
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " +candidato+ " foi selecionado.");
                candidatosSelecionados[nCandidatosSelecionados] = candidato;
                nCandidatosSelecionados++;
            }
            else
            System.out.println("O candidato " +candidato+ " não foi selecionado.");
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        
        return ThreadLocalRandom.current().nextDouble(1800, 2000);
    }  

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
             if(salarioBase > salarioPretendido){
                 System.out.println("Ligar para o candidato");
             }
             else if (salarioBase == salarioPretendido){
                 System.out.println("Ligar para o candidato com contra-proposta");
             }
             else
                 System.out.println("Aguardando resultado de demais candidatos");

    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

}