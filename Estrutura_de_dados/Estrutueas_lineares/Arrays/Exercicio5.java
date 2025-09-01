package Estrutura_de_dados.Estrutueas_lineares.Arrays;

public class Exercicio5 {
    public static void main(String[] args) {
        int[] vetor = {50,20,10,30,40};
        int aux;

        for(int i = 0 ; i < 5 -1; i++){
            for(int j = 0; j < 5 - 1 - i; j++){
                aux = vetor[j];
                vetor[j] = vetor[j + 1];
                vetor[j + 1] = aux;
            }
        }

        System.out.println("Array ordenado: ");
        for(int i = 0; i < 5; i++){
            System.out.println(vetor[i] + "");
        }
    }
}
