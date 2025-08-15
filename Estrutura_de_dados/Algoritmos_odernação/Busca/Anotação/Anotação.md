# Busca Linear e Busca Binária em Java

## Busca Linear

### Conceito

* Percorre todos os elementos de um array até encontrar o valor desejado.
* Não precisa que os dados estejam ordenados.

### Como funciona

1. Começa do primeiro elemento.
2. Compara cada elemento com o valor procurado.
3. Para quando encontrar ou chegar ao fim do array.

### Complexidade

* Melhor caso: O(1) → elemento está na primeira posição.
* Pior caso: O(n) → elemento está na última posição ou não existe.

### Vantagens

* Simples de implementar.
* Funciona para qualquer tipo de array.

### Desvantagens

* Ineficiente para arrays grandes.

### Exemplo (Java)

```java
public class BuscaLinear {
    public static int buscaLinear(int[] array, int valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40};
        System.out.println(buscaLinear(numeros, 30)); // Saída: 2
    }
}
```

---

## Busca Binária

### Conceito

* Procura por um elemento dividindo repetidamente o array ao meio.
* **Necessita que o array esteja ordenado**.

### Como funciona

1. Define início e fim do array.
2. Calcula o índice do meio.
3. Se o valor do meio for o procurado → retorna.
4. Se o valor procurado for menor → busca na metade esquerda.
5. Se for maior → busca na metade direita.
6. Repete até encontrar ou não restarem elementos.

### Complexidade

* Melhor caso: O(1) → valor encontrado de primeira.
* Pior caso: O(log n) → reduz pela metade a cada passo.

### Vantagens

* Muito mais rápida que a busca linear para arrays grandes.

### Desvantagens

* Requer array ordenado.

### Exemplo (Java)

```java
public class BuscaBinaria {
    public static int buscaBinaria(int[] array, int valor) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (array[meio] == valor) {
                return meio;
            } else if (array[meio] < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        System.out.println(buscaBinaria(numeros, 30)); // Saída: 2
    }
}
```
