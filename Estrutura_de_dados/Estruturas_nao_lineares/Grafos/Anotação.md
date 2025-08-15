# Grafos em Java

## Conceito
- Estrutura formada por um conjunto de **vértices** (nós) conectados por **arestas**.
- Tipos de grafos:
  - **Direcionados**: arestas têm direção (A → B).
  - **Não-direcionados**: arestas não têm direção (A ↔ B).
  - **Ponderados**: arestas possuem peso (custo).
  - **Não-ponderados**: arestas não possuem peso.

## Representações
- **Lista de Adjacência**: cada vértice mantém uma lista com os vértices conectados a ele.
- **Matriz de Adjacência**: tabela bidimensional que indica conexões e, opcionalmente, pesos.

## Aplicações
- Redes de computadores.
- Mapas e rotas.
- Redes sociais.
- Sistemas de recomendação.

---

## Exemplo usando Lista de Adjacência
```java
import java.util.*;

public class GrafoListaAdj {
    private Map<Integer, List<Integer>> listaAdj;

    public GrafoListaAdj() {
        listaAdj = new HashMap<>();
    }

    public void adicionarVertice(int vertice) {
        listaAdj.putIfAbsent(vertice, new ArrayList<>());
    }

    public void adicionarAresta(int origem, int destino) {
        listaAdj.get(origem).add(destino);
        // Se for não-direcionado, adicionar também:
        // listaAdj.get(destino).add(origem);
    }

    public void exibirGrafo() {
        for (var vertice : listaAdj.keySet()) {
            System.out.println(vertice + " -> " + listaAdj.get(vertice));
        }
    }

    public static void main(String[] args) {
        GrafoListaAdj grafo = new GrafoListaAdj();
        grafo.adicionarVertice(1);
        grafo.adicionarVertice(2);
        grafo.adicionarVertice(3);

        grafo.adicionarAresta(1, 2);
        grafo.adicionarAresta(1, 3);
        grafo.adicionarAresta(2, 3);

        grafo.exibirGrafo();
    }
}
Exemplo usando Matriz de Adjacência
java

public class GrafoMatrizAdj {
    private int[][] matriz;
    private int numVertices;

    public GrafoMatrizAdj(int numVertices) {
        this.numVertices = numVertices;
        matriz = new int[numVertices][numVertices];
    }

    public void adicionarAresta(int origem, int destino) {
        matriz[origem][destino] = 1;
        // Se for não-direcionado:
        // matriz[destino][origem] = 1;
    }

    public void exibirMatriz() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GrafoMatrizAdj grafo = new GrafoMatrizAdj(4);
        grafo.adicionarAresta(0, 1);
        grafo.adicionarAresta(0, 2);
        grafo.adicionarAresta(1, 3);

        grafo.exibirMatriz();
    }
}