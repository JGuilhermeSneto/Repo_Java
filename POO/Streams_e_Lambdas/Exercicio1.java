package POO.Streams_e_Lambdas;

import java.util.Arrays;
import java.util.List;

public class Exercicio1 {
    public static void main(String[] args) {
        List<String> nome = Arrays.asList("Ana", "Pedro", "Amanda", "Lucas", "Tiago");

        nome.stream()
            .filter(n -> n.startsWith("A"))   // Filtra nomes que começam com A
            .map(String::toUpperCase)        // Converte para maiúsculas
            .sorted()                         // Ordena alfabeticamente
            .forEach(System.out::println);    // Imprime cada elemento
    }
}
