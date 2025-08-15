# Algoritmos de Ordenação em Java

## Bubble Sort

### Conceito

* Compara elementos adjacentes e troca se necessário.
* Passa várias vezes até ordenar.

### Complexidade

* Melhor caso: O(n)
* Pior caso: O(n²)

### Desvantagens

* Ineficiente para arrays grandes.

### Exemplo (Java)

```java
public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numeros = {5, 2, 9, 1, 5, 6};
        bubbleSort(numeros);
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
```

---

## Insertion Sort

### Conceito

* Constrói a lista ordenada um elemento por vez.
* Insere cada novo elemento na posição correta entre os já ordenados.

### Complexidade

* Melhor caso: O(n)
* Pior caso: O(n²)

### Exemplo (Java)

```java
public class InsertionSort {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int chave = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > chave) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = chave;
        }
    }

    public static void main(String[] args) {
        int[] numeros = {5, 2, 9, 1, 5, 6};
        insertionSort(numeros);
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
```

---

## Selection Sort

### Conceito

* Encontra o menor elemento e o coloca na posição correta.
* Repete até ordenar todo o array.

### Complexidade

* Melhor caso: O(n²)
* Pior caso: O(n²)

### Exemplo (Java)

```java
public class SelectionSort {
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numeros = {64, 25, 12, 22, 11};
        selectionSort(numeros);
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
```

---

## Merge Sort

### Conceito

* Algoritmo de ordenação baseado em "Dividir e Conquistar".
* Divide o array ao meio, ordena cada metade e combina.

### Exemplo (Java)

```java
public class MergeSort {
    public static void mergeSort(int[] array) {
        if (array.length > 1) {
            int meio = array.length / 2;
            int[] esquerda = new int[meio];
            int[] direita = new int[array.length - meio];

            System.arraycopy(array, 0, esquerda, 0, meio);
            System.arraycopy(array, meio, direita, 0, array.length - meio);

            mergeSort(esquerda);
            mergeSort(direita);

            int i = 0, j = 0, k = 0;
            while (i < esquerda.length && j < direita.length) {
                if (esquerda[i] < direita[j]) {
                    array[k++] = esquerda[i++];
                } else {
                    array[k++] = direita[j++];
                }
            }
            while (i < esquerda.length) {
                array[k++] = esquerda[i++];
            }
            while (j < direita.length) {
                array[k++] = direita[j++];
            }
        }
    }

    public static void main(String[] args) {
        int[] numeros = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(numeros);
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
```

---

## Quick Sort

### Conceito

* Algoritmo de ordenação rápido baseado em "Dividir e Conquistar".
* Escolhe um pivô e organiza os elementos menores antes e maiores depois.

### Exemplo (Java)

```java
public class QuickSort {
    public static void quickSort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int pivoIndex = partition(array, inicio, fim);
            quickSort(array, inicio, pivoIndex - 1);
            quickSort(array, pivoIndex + 1, fim);
        }
    }

    private static int partition(int[] array, int inicio, int fim) {
        int pivo = array[(inicio + fim) / 2];
        int i = inicio;
        int j = fim;
        while (i <= j) {
            while (array[i] < pivo) i++;
            while (array[j] > pivo) j--;
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] numeros = {10, 7, 8, 9, 1, 5};
        quickSort(numeros, 0, numeros.length - 1);
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
```
