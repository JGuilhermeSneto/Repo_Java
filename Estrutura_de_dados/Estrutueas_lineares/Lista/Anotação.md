# Lista Simples Encadeada em Java

## Definição
- Conjunto de nós conectados por **referências** (ponteiros em outras linguagens).
- Cada nó contém:
  - **Dado** (valor armazenado).
  - **Referência** para o **próximo nó** da lista.
- O primeiro elemento é chamado **cabeça** (*head*), e o último aponta para `null`.

## Vantagens
- Inserções e remoções rápidas em qualquer posição (sem deslocamento de elementos).
- Tamanho dinâmico, não precisa ser definido na criação.

## Desvantagens
- Acesso **sequencial**: para chegar a um elemento é necessário percorrer a lista desde o início (**O(n)**).
- Uso extra de memória para armazenar a referência para o próximo nó.

## Estrutura de Nó
```java
class No {
    int dado;
    No proximo;

    public No(int dado) {
        this.dado = dado;
        this.proximo = null;
    }
}
Exemplo de Implementação

public class ListaSimples {
    No head;

    // Inserir no final
    public void inserir(int valor) {
        No novoNo = new No(valor);
        if (head == null) {
            head = novoNo;
        } else {
            No atual = head;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
    }

    // Remover pelo valor
    public void remover(int valor) {
        if (head == null) return;

        if (head.dado == valor) {
            head = head.proximo;
            return;
        }

        No atual = head;
        while (atual.proximo != null && atual.proximo.dado != valor) {
            atual = atual.proximo;
        }

        if (atual.proximo != null) {
            atual.proximo = atual.proximo.proximo;
        }
    }

    // Exibir lista
    public void exibir() {
        No atual = head;
        while (atual != null) {
            System.out.print(atual.dado + " -> ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();
        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);
        
        lista.exibir();

        lista.remover(20);
        lista.exibir();
    }
}
Saída do exemplo

10 -> 20 -> 30 -> null
10 -> 30 -> null