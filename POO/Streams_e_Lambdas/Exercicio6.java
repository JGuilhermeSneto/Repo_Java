package POO.Streams_e_Lambdas;

import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Exercicio6 {
    public static void main(String[] args) {
        Supplier<Integer> gerarNumero = () -> new Random().nextInt(10) + 1;
        BinaryOperator<Integer> soma = (a, b) -> a + b;

        int resultado = Stream.generate(gerarNumero)  // Gera infinitamente
                               .limit(5)             // Limita a 5 números
                               .reduce(0, soma);     // Soma todos

        System.out.println("Soma dos números gerados: " + resultado);
    }
}
