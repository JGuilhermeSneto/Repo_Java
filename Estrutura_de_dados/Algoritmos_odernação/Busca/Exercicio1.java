import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int vetor[] = new int[10];
        int chave;

        vetor[0] = 10;
        vetor[1] = 20;
        vetor[2] = 30;
        vetor[3] = 40;
        vetor[4] = 50;
        
        System.out.println("Digite um número que deseja buscar: ");
        chave = sc.nextInt();

        for(int i = 0; i < 4; i++){
            if(vetor[i] == chave){
                System.out.println("Elemento encontrado na posição: " + i);
                break;
            }
        }

    }
}
