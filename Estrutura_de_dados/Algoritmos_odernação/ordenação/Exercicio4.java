package Estrutura_de_dados.Algoritmos_odernação.ordenação;

public class Exercicio4 {
    public static void main(String[] args) {
        String[] nomes = {"Carlos", "Ana", "Souza", "Dimitri"};
        String aux;

        for (int i = 0; i < nomes.length - 1; i++) {
            for (int j = 0; j < nomes.length - 1 - i; j++) {
                if (nomes[j].compareTo(nomes[j + 1]) > 0) {
                    aux = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = aux;
                }
            }
        }

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
