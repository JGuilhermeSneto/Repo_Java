package POO.Streams_e_Lambdas;

import java.util.Arrays;
import java.util.List;

public class Exercicio4 {
    public static void main(String[] args) {
        // Runnable com Lambda
        Runnable tarefa = () -> System.out.println("Executando Thread com Lambda!");
        new Thread(tarefa).start();

        // Comparator com Lambda
        List<String> nomes = Arrays.asList("Pedro", "Ana", "Lucas");
        nomes.sort((a, b) -> a.compareTo(b));
        System.out.println("Ordenado: " + nomes);
    }
}
