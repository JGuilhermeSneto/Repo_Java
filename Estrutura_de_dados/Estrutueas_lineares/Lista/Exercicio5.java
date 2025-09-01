package Estrutura_de_dados.Estrutueas_lineares.Lista;

public class Exercicio5 {
    static int[] lista = new int[10];
    static int tamanho = 5;

    public static void Lista() {
        lista[0] = 10;
        lista[1] = 50;
        lista[2] = 30;
        lista[3] = 40;
        lista[4] = 20;
    }

    public static void main(String[] args) {
        Lista();

        int aux;
        for (int i = 0; i < tamanho - 1; i++) {          
            for (int j = 0; j < tamanho - 1 - i; j++) {   
                if (lista[j] > lista[j + 1]) {
                    aux = lista[j];
                    lista[j] = lista[j + 1];
                    
                    lista[j + 1] = aux;
                }
            }
        }

        System.out.println("Lista ordenada:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(lista[i]);
        }
    }
}
