/**
 *  <h1> Controle Remoto </h1>
 * Esta classe realiza os comandos básicos de um controle remoto, como aumentar e diminuir o volume e mudar de canal.
 * <p>
 * <b>Note:</b> Leia atentamente a documentação para um uso correto da classe.
 * 
 * @author Elson Filho
 * @version 1.0
 * @since 02/04/2024
  */


public class SmartTv {
    
boolean estado = false;
int canal = 0;
int volume = 25;    


public void ligar(){
    estado = true;
}

public void desligar(){
    estado = false;
}

public void power(){
    estado = !estado;
    System.out.println("Estado da TV: " +estado);
}

public void aumentarVolume(){
    System.out.println("Aumentando volume para: " +volume++);
}

public void diminuirVolume(){
    System.out.println("Diminuindo volume para: " +volume--);
}

public void mudarCanal(int novoCanal){
    canal = novoCanal;
    System.out.println("Canal alterado: " +canal);
}

public void subirCanal(){
    canal++;
    System.out.println("Canal alterado: " +canal);
}

public void descerCanal(){
    canal--;
    System.out.println("Canal alterado: " +canal);
}

}