public class Condicionais {
    
    public static void main (String[] args) {
            
        boolean condicao1 = false;
        boolean condicao2 = false;

        condicao1 = !condicao1;
        condicao2 = !condicao2;

        if (condicao1 && condicao2)
            System.out.println("Ambas as condições são verdadeiras");
        if (condicao1 || condicao2)
        System.out.println("Ao menos uma das condições é verdadeira");
        else
        System.out.println("Nenhuma das condições é verdadeira");
    }
    
    }