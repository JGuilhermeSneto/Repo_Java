# Array (Vetor e Matriz em Java)

## Definição
- Estrutura de dados que armazena **elementos do mesmo tipo** em posições contíguas na memória.
- O acesso aos elementos é feito por **índice** e tem custo **O(1)**.
- Em Java, os arrays têm **tamanho fixo** definido na criação.

## Tipos
- **Vetor**: Array de **1 dimensão**.  
- **Matriz**: Array de **2 ou mais dimensões**.

## Vantagens
- Acesso rápido por índice.
- Estrutura simples de usar.

## Desvantagens
- Tamanho fixo (não é possível aumentar ou reduzir depois de criado).
- Inserções e remoções no meio do array são custosas (necessitam deslocar elementos).

## Exemplo de Vetor em Java
```java
public class VetorExemplo {
    public static void main(String[] args) {
        int[] vetor = {10, 20, 30};
        
        System.out.println(vetor[1]); // Saída: 20
    }
}
Exemplo de Matriz em Java

public class MatrizExemplo {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println(matriz[1][2]); // Saída: 6
    }
}