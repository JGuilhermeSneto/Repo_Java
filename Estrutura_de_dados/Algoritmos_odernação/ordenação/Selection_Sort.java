package Estrutura_de_dados.Algoritmos_odernação.ordenação;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] vetor = {64, 25, 12, 11, 22};
        int aux;

        for (int i = 0; i < vetor.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[min]) {
                    min = j;
                }
            }

            aux = vetor[i];
            vetor[i] = vetor[min];
            vetor[min] = aux;
        }


        for (int valor : vetor) {
            System.out.println(valor + " ");
        }
    }
}
