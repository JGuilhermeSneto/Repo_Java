package Exercicios_de_Logica;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TimesAleatorios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        System.out.println("Digite os nomes (digite 'fim' para encerrar):");
        while (true) {
            String nome = scanner.nextLine().trim();
            if (nome.equalsIgnoreCase("fim")) break;
            if (!nome.isEmpty()) {
                nomes.add(nome);
            }
        }

        if (nomes.isEmpty()) {
            System.out.println("Nenhum nome digitado.");
            return;
        }

        // Embaralhar os nomes para formar times aleatórios
        Collections.shuffle(nomes);

        final int MAX_POR_TIME = 4;
        List<List<String>> times = new ArrayList<>();

        for (int i = 0; i < nomes.size(); i += MAX_POR_TIME) {
            int fim = Math.min(i + MAX_POR_TIME, nomes.size());
            times.add(new ArrayList<>(nomes.subList(i, fim)));
        }

        // Exibir os times
        System.out.println("\nTimes formados aleatoriamente:");
        for (int i = 0; i < times.size(); i++) {
            System.out.println("Time " + (i + 1) + ": " + times.get(i));
        }

        scanner.close();
    }
}
