import java.util.Scanner;

public class Exercicio3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] vetor = {5, 10, 20, 30, 40, 50};
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;
        int chave;

        System.out.println("Digite um número que deseja buscar: ");
        chave = sc.nextInt();

        boolean encontrado = false;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;

            if (vetor[meio] == chave) {
                System.out.println("Encontrado na posição: " + meio);
                encontrado = true;
                break;
            } else if (chave < vetor[meio]) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }

        if (!encontrado) {
            System.out.println("Número não encontrado!");
        }

        sc.close();
    }
}
