package Estrutura_de_dados.Algoritmos_odernação.ordenação;

public class Inserstion_Sort {
    public static void main(String[] args) {
        int chave;
        int j;
        int[] vetor = {12,11,13,24,52,45};


        for(int i = 1; i < vetor.length;i++){
            chave = vetor[i];
            j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }

        for (int valor : vetor) {
            System.out.println(valor + "");
        }

    }
}
