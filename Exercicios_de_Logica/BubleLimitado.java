package Exercicios_de_Logica;
import java.util.Scanner;

public class BubleLimitado {
    public static void main(String[] args) {
        int[] vetor = {20, 18, 12, 8, 5};
        int interacoes;

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas interações você quer? (máximo: " + (vetor.length - 1) + ")");
        interacoes = sc.nextInt();

        // Garante que não ultrapasse o número máximo de interações possíveis
        if (interacoes > vetor.length - 1) {
            interacoes = vetor.length - 1;
            System.out.println("Limite ajustado para: " + interacoes);
        }

        // Algoritmo Selection Sort limitado pelo número de interações
        for (int i = 0; i < interacoes; i++) {
            int minIndex = i;  // Corrigido: começa da posição atual
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[minIndex]) {
                    minIndex = j;
                }
            }

            // Troca
            int temp = vetor[i];
            vetor[i] = vetor[minIndex];
            vetor[minIndex] = temp;
        }

        // Exibe resultado
        System.out.print("Vetor após " + interacoes + " interações: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
