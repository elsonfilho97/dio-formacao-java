// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.Scanner;

public class Nomes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nomes[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
		
		for(int i=0 ; i<10 ; i++)
			nomes[i] = sc.nextLine();
			
			for(int i=0; i<10; i++){
                if ((i != 2) && (i != 6) && (i != 8))
                    continue;
			    System.out.println(nomes[i]);
            }
            
        sc.close();
	}
	
}