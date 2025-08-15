# Tabela Hash em Java

## Conceito
- Estrutura de dados que **mapeia** `chave → valor`.
- Utiliza uma **função de hash** para calcular a posição (índice) de armazenamento do valor na tabela.
- Muito usada para buscas rápidas.

## Problemas
- **Colisões**: quando duas chaves diferentes geram o mesmo índice.
- **Soluções**:
  - **Encadeamento** (*chaining*): cada posição da tabela armazena uma lista de elementos.
  - **Endereçamento aberto** (*open addressing*): em caso de colisão, procura-se outra posição disponível.

## Complexidade
- **Busca**: O(1) em média, O(n) no pior caso.
- **Inserção**: O(1) em média.
- **Remoção**: O(1) em média.

---

## Exemplo usando `HashMap` (implementação pronta do Java)
```java
import java.util.HashMap;

public class TabelaHashExemplo {
    public static void main(String[] args) {
        HashMap<String, Integer> tabela = new HashMap<>();

        // Inserção
        tabela.put("João", 25);
        tabela.put("Maria", 30);
        tabela.put("Pedro", 22);

        // Acesso
        System.out.println("Idade de Maria: " + tabela.get("Maria"));

        // Remoção
        tabela.remove("Pedro");

        // Iteração
        for (String chave : tabela.keySet()) {
            System.out.println(chave + " -> " + tabela.get(chave));
        }
    }
}
Exemplo de implementação simples com encadeamento

import java.util.LinkedList;

class Entrada {
    String chave;
    int valor;

    public Entrada(String chave, int valor) {
        this.chave = chave;
        this.valor = valor;
    }
}

public class TabelaHashEncadeada {
    private LinkedList<Entrada>[] tabela;
    private int capacidade;

    @SuppressWarnings("unchecked")
    public TabelaHashEncadeada(int capacidade) {
        this.capacidade = capacidade;
        tabela = new LinkedList[capacidade];
        for (int i = 0; i < capacidade; i++) {
            tabela[i] = new LinkedList<>();
        }
    }

    private int hash(String chave) {
        return Math.abs(chave.hashCode() % capacidade);
    }

    public void put(String chave, int valor) {
        int indice = hash(chave);
        for (Entrada entrada : tabela[indice]) {
            if (entrada.chave.equals(chave)) {
                entrada.valor = valor;
                return;
            }
        }
        tabela[indice].add(new Entrada(chave, valor));
    }

    public Integer get(String chave) {
        int indice = hash(chave);
        for (Entrada entrada : tabela[indice]) {
            if (entrada.chave.equals(chave)) {
                return entrada.valor;
            }
        }
        return null;
    }

    public void remove(String chave) {
        int indice = hash(chave);
        tabela[indice].removeIf(entrada -> entrada.chave.equals(chave));
    }

    public static void main(String[] args) {
        TabelaHashEncadeada tabela = new TabelaHashEncadeada(10);
        tabela.put("João", 25);
        tabela.put("Maria", 30);

        System.out.println("Idade de João: " + tabela.get("João"));

        tabela.remove("Maria");
        System.out.println("Idade de Maria: " + tabela.get("Maria"));
    }
}