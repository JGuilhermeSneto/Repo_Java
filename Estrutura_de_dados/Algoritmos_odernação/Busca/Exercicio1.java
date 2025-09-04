import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = {10,20,30,40,50};
        int chave;

        System.out.println("Digite o número que deseja buscar: ");
        chave = sc.nextInt();

        for(int i = 0; i < vetor.length; i++){
            if (vetor[i] == chave) {
                System.out.println("Elemento encontrado na posição: " + i);
                break;
            }
        }
    }
}
