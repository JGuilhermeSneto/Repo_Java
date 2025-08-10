package Exercicios;
import java.util.Scanner;

public class contarInteracoes {
    public static void main(String[] args) {
        int[] vetor = {1969, 1993, 2013, 1989, 1245, 1243, 2024, 1999, 1920, 2025, 1991, 2005};
        int interacoes = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o algoritmo de ordenação:");
        System.out.println("1 - Selection Sort");
        System.out.println("2 - Insertion Sort");
        System.out.println("3 - Bubble Sort");
        System.out.print("Digite sua opção: ");
        int opc = sc.nextInt();

        switch (opc) {
            case 1:
                // Selection Sort
                for (int i = 0; i < vetor.length - 1; i++) {
                    int minIndex = i;
                    for (int j = i + 1; j < vetor.length; j++) {
                        interacoes++;
                        if (vetor[j] < vetor[minIndex]) {
                            minIndex = j;
                        }
                    }
                    int temp = vetor[i];
                    vetor[i] = vetor[minIndex];
                    vetor[minIndex] = temp;
                }
                System.out.println("Algoritmo escolhido: Selection Sort");
                break;

            case 2:
                // Insertion Sort
                for (int i = 1; i < vetor.length; i++) {
                    int chave = vetor[i];
                    int j = i - 1;

                    while (j >= 0 && vetor[j] > chave) {
                        vetor[j + 1] = vetor[j];
                        j--;
                        interacoes++;
                    }
                    vetor[j + 1] = chave;
                }
                System.out.println("Algoritmo escolhido: Insertion Sort");
                break;

            case 3:
                // Bubble Sort
                for (int i = 0; i < vetor.length - 1; i++) {
                    for (int j = 0; j < vetor.length - 1 - i; j++) {
                        interacoes++;
                        if (vetor[j] > vetor[j + 1]) {
                            int temp = vetor[j];
                            vetor[j] = vetor[j + 1];
                            vetor[j + 1] = temp;
                        }
                    }
                }
                System.out.println("Algoritmo escolhido: Bubble Sort");
                break;

            default:
                System.out.println("Opção inválida!");
                sc.close();
                return;
        }

        // Exibir vetor ordenado
        System.out.print("\nVetor ordenado: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }

        // Exibir número de interações
        System.out.println("\nInterações realizadas: " + interacoes);

        sc.close();
    }
}
