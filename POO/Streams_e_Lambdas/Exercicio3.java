package POO.Streams_e_Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(5, 1, 2, 2, 3, 4, 4, 5);

        List<String> resultado = numeros.stream()
                                        .distinct()           // Remove duplicatas
                                        .limit(3)            // Pega os 3 primeiros
                                        .skip(1)             // Ignora o 1º
                                        .map(String::valueOf)// Converte para String
                                        .collect(Collectors.toList());

        System.out.println("Resultado: " + resultado);
        System.out.println("Quantidade: " + resultado.size());
    }
}
