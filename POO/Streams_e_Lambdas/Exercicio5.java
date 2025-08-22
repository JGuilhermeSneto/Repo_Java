package POO.Streams_e_Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Exercicio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        Predicate<Integer> ehPar = n -> n % 2 == 0;
        Function<Integer, Integer> quadrado = n -> n * n;
        Consumer<Integer> imprimir = n -> System.out.println("Valor: " + n);

        numeros.stream()
               .filter(ehPar)
               .map(quadrado)
               .forEach(imprimir);
    }
}
