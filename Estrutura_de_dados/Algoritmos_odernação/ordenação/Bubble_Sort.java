package Estrutura_de_dados.Algoritmos_odernação.ordenação;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] vetor = {5, 2, 9, 1, 6};
        int aux;

        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }

        for (int i : vetor) {
            System.out.println(i + " ");
        }
    }
}
