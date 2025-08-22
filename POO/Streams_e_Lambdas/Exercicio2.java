package POO.Streams_e_Lambdas;

import java.util.Arrays;
import java.util.List;


public class Exercicio2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        int somaQuadrados = numeros.stream()
                                   .filter(n -> n % 2 == 0)   // Filtra pares
                                   .map(n -> n * n)          // Eleva ao quadrado
                                   .reduce(0, Integer::sum); // Soma todos

        System.out.println("Soma dos quadrados pares: " + somaQuadrados);
    }
}
