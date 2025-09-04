
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String chave;
        String[] nomes = new String[4];

        nomes[0] = "Ana";
        nomes[1] = "Pedro";
        nomes[2] = "João";
        nomes[3] = "Guilherme";
        
        System.out.print("Digite um nome: ");
        chave = sc.nextLine();

        boolean encontrado = false;

        for(int i = 0; i < nomes.length; i++){
            if(nomes[i].equals(chave)){ 
                System.out.println("Nome encontrado na posição: " + i);
                encontrado = true;
                break;
            }
        }

        if(!encontrado){
            System.out.println("Nome não encontrado!");
        }

        sc.close();
    }
}

