# Pilha (Stack em Java)

## Conceito
- Estrutura **LIFO** (*Last In, First Out*), ou seja, o último elemento inserido é o primeiro a ser removido.
- Operações principais:
  - **push**: insere um elemento no topo.
  - **pop**: remove o elemento do topo.
  - **peek/top**: visualiza o elemento no topo sem removê-lo.

## Vantagens
- Simples de implementar.
- Útil para funcionalidades como:
  - Desfazer ações (*Ctrl + Z*).
  - Navegação entre páginas (histórico).
  - Avaliação de expressões matemáticas.

## Complexidade
- **Inserção (push)**: O(1)
- **Remoção (pop)**: O(1)
- **Acesso**: O(n) no pior caso (se precisar percorrer).

## Exemplo usando `Stack` do Java
```java
import java.util.Stack;

public class PilhaExemplo {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();

        // push
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("Pilha: " + pilha);

        // peek
        System.out.println("Topo: " + pilha.peek());

        // pop
        System.out.println("Removido: " + pilha.pop());
        System.out.println("Pilha após remoção: " + pilha);
    }
}
Exemplo de implementação manual de Pilha
java
Copiar
Editar
public class PilhaArray {
    private int[] elementos;
    private int topo;

    public PilhaArray(int capacidade) {
        elementos = new int[capacidade];
        topo = -1;
    }

    public void push(int valor) {
        if (topo < elementos.length - 1) {
            elementos[++topo] = valor;
        } else {
            System.out.println("Pilha cheia!");
        }
    }

    public int pop() {
        if (topo >= 0) {
            return elementos[topo--];
        } else {
            System.out.println("Pilha vazia!");
            return -1;
        }
    }

    public int peek() {
        if (topo >= 0) {
            return elementos[topo];
        } else {
            System.out.println("Pilha vazia!");
            return -1;
        }
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public static void main(String[] args) {
        PilhaArray pilha = new PilhaArray(5);
        pilha.push(5);
        pilha.push(10);
        pilha.push(15);

        System.out.println("Topo: " + pilha.peek());
        System.out.println("Removido: " + pilha.pop());
        System.out.println("Topo após remoção: " + pilha.peek());
    }
}

