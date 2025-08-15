# Complexidade de Algoritmos em Java

## Conceito

* Mede o custo de um algoritmo em tempo de execução e espaço de memória.

## Notações Comuns

* O(1) → Constante (tempo fixo)
* O(log n) → Logarítmica
* O(n) → Linear
* O(n²) → Quadrática
* O(2^n) → Exponencial

## Importância

* Ajuda a escolher o algoritmo mais eficiente.
* Permite comparar diferentes soluções para o mesmo problema.

## Exemplo em Java

```java
public class ComplexidadeExemplo {
    // Exemplo de complexidade O(n)
    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        imprimirArray(numeros);
    }
}
```

### Explicação do Exemplo

* O método `imprimirArray` percorre cada elemento do array uma vez → complexidade O(n).
* Se fosse apenas imprimir um valor fixo → complexidade O(1).

## Resumo Visual

| Notação  | Tipo        | Exemplo                  |
| -------- | ----------- | ------------------------ |
| O(1)     | Constante   | Imprimir um valor fixo   |
| O(log n) | Logarítmica | Busca Binária            |
| O(n)     | Linear      | Percorrer um array       |
| O(n²)    | Quadrática  | Bubble Sort              |
| O(2^n)   | Exponencial | Problemas de força bruta |
