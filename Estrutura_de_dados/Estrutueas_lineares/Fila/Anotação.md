# Fila (Queue em Java)

## Conceito
- Estrutura **FIFO** (*First In, First Out*), ou seja, o primeiro elemento a entrar é o primeiro a sair.
- Operações principais:
  - **enqueue**: insere um elemento no final da fila.
  - **dequeue**: remove um elemento do início da fila.

## Vantagens
- Útil para processamento em ordem de chegada.
- Implementação simples utilizando **`LinkedList`** ou arrays circulares.

## Aplicações
- Fila de impressão.
- Processos em sistemas operacionais.
- Atendimento em filas de serviços.

## Exemplo de Fila em Java usando `Queue`
```java
import java.util.LinkedList;
import java.util.Queue;

public class FilaExemplo {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // enqueue - adiciona elementos
        fila.add("Primeiro");
        fila.add("Segundo");
        fila.add("Terceiro");

        System.out.println("Fila: " + fila);

        // dequeue - remove o primeiro
        String removido = fila.poll();
        System.out.println("Removido: " + removido);
        System.out.println("Fila após remoção: " + fila);
    }
}
Exemplo de Fila implementada manualmente com Array
java

public class FilaArray {
    private int[] elementos;
    private int tamanho;

    public FilaArray(int capacidade) {
        elementos = new int[capacidade];
        tamanho = 0;
    }

    // enqueue
    public void enqueue(int valor) {
        if (tamanho < elementos.length) {
            elementos[tamanho] = valor;
            tamanho++;
        } else {
            System.out.println("Fila cheia!");
        }
    }

    // dequeue
    public int dequeue() {
        if (tamanho > 0) {
            int removido = elementos[0];
            for (int i = 0; i < tamanho - 1; i++) {
                elementos[i] = elementos[i + 1];
            }
            tamanho--;
            return removido;
        } else {
            System.out.println("Fila vazia!");
            return -1;
        }
    }

    public void exibirFila() {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        FilaArray fila = new FilaArray(5);
        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);

        fila.exibirFila();

        fila.dequeue();
        fila.exibirFila();
    }
}