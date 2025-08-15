# Árvore Binária em Java

## Conceito
- Estrutura **hierárquica** de nós.
- Cada nó pode ter até **dois filhos**:
  - **Filho esquerdo**.
  - **Filho direito**.

## Termos
- **Raiz**: nó inicial da árvore.
- **Folha**: nó sem filhos.
- **Altura**: comprimento do maior caminho da raiz até uma folha.

## Aplicações
- Organização hierárquica (ex.: estrutura de arquivos).
- Representação de expressões matemáticas.
- Busca e ordenação de dados (árvore binária de busca).

## Estrutura de Nó
```java
class No {
    int valor;
    No esquerdo;
    No direito;

    public No(int valor) {
        this.valor = valor;
        this.esquerdo = null;
        this.direito = null;
    }
}
Exemplo de Implementação

public class ArvoreBinaria {
    No raiz;

    // Inserção na árvore (modo árvore binária de busca)
    public void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    private No inserirRecursivo(No atual, int valor) {
        if (atual == null) {
            return new No(valor);
        }
        if (valor < atual.valor) {
            atual.esquerdo = inserirRecursivo(atual.esquerdo, valor);
        } else if (valor > atual.valor) {
            atual.direito = inserirRecursivo(atual.direito, valor);
        }
        return atual;
    }

    // Percorrer em ordem (in-order)
    public void percorrerInOrder(No no) {
        if (no != null) {
            percorrerInOrder(no.esquerdo);
            System.out.print(no.valor + " ");
            percorrerInOrder(no.direito);
        }
    }

    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.inserir(50);
        arvore.inserir(30);
        arvore.inserir(70);
        arvore.inserir(20);
        arvore.inserir(40);
        arvore.inserir(60);
        arvore.inserir(80);

        System.out.println("Percurso em ordem:");
        arvore.percorrerInOrder(arvore.raiz);
    }
}
Saída do exemplo

Percurso em ordem:
20 30 40 50 60 70 80