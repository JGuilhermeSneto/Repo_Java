# 📊 Exercícios de Complexidade em Java --- Resoluções

------------------------------------------------------------------------

## **Exercício 1 --- Laço simples**


public class Ex1 {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}


**Pergunta:** Qual é a complexidade de tempo do algoritmo acima?
A) O(1)
B) O(log n)
C) O(n) | (x)
D) O(n²)

✅ Resposta correta: **C) O(n)**

### ✔ Explicação:

O laço `for` percorre de `1 até n`, ou seja, faz **n iterações**.\
- Cada iteração executa uma instrução simples.\
- Portanto, o tempo cresce proporcionalmente a `n`.

------------------------------------------------------------------------

## **Exercício 2 --- Laço aninhado**


public class Ex2 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("(" + i + "," + j + ") ");
            }
        }
    }
}


**Pergunta:** Qual a complexidade do algoritmo acima?
A) O(n)
B) O(n log n)
C) O(n²) | (x)
D) O(2ⁿ)

✅ Resposta correta: **C) O(n²)**

### ✔ Explicação:

-   O laço externo executa `n` vezes.\
-   Para cada iteração do externo, o laço interno também roda `n`
    vezes.\
-   Total: `n * n = n²` operações → **O(n²)**.

------------------------------------------------------------------------

## **Exercício 3 --- Busca linear**


public class Ex3 {
    public static void main(String[] args) {
        int[] vetor = {10, 20, 30, 40, 50};
        int chave = 40;
        boolean encontrado = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == chave) {
                System.out.println("Encontrado na posição " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Não encontrado.");
        }
    }
}
```

**Pergunta:** Qual a complexidade da busca linear no pior caso?
A) O(1)
B) O(n) | (x)
C) O(log n)
D) O(n²)

✅ Resposta correta: **B) O(n)**

### ✔ Explicação:

-   No pior caso, o algoritmo percorre todo o vetor (quando a chave está
    no fim ou não existe).\
-   Assim, são feitas até `n` comparações.\
-   Complexidade: **O(n)**.

------------------------------------------------------------------------

## **Exercício 4 --- Busca binária**

public class Ex4 {
    public static boolean buscaBinaria(int[] vetor, int chave, int inicio, int fim) {
        if (inicio > fim) {
            return false;
        }

        int meio = (inicio + fim) / 2;

        if (vetor[meio] == chave) {
            return true;
        } else if (chave < vetor[meio]) {
            return buscaBinaria(vetor, chave, inicio, meio - 1);
        } else {
            return buscaBinaria(vetor, chave, meio + 1, fim);
        }
    }

    public static void main(String[] args) {
        int[] vetor = {10, 20, 30, 40, 50, 60, 70};
        int chave = 70;

        System.out.println(buscaBinaria(vetor, chave, 0, vetor.length - 1));
    }
}
```

**Pergunta:** Qual é a complexidade da busca binária no pior caso?
A) O(n)
B) O(log n) | (x)
C) O(n log n)
D) O(1)

✅ Resposta correta: **B) O(log n)**

### ✔ Explicação:

-   A cada chamada recursiva, o vetor é dividido ao meio.\
-   O número de elementos a verificar cai pela metade a cada passo.\
-   Isso gera uma progressão logarítmica → **O(log n)**.

------------------------------------------------------------------------

## **Exercício 5 --- Somatório aninhado desigual**

public class Ex5 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("(" + i + "," + j + ") ");
            }
        }
    }
}
```

**Pergunta:** Quantas vezes aproximadamente o print será executado e
qual a complexidade?
A) Aproximadamente n → O(n)
B) Aproximadamente n² → O(n²) | (x)
C) Aproximadamente log n → O(log n)
D) Aproximadamente 2ⁿ → O(2ⁿ)

✅ Resposta correta: **B) Aproximadamente n² → O(n²)**

### ✔ Explicação:

-   O laço interno não roda sempre até `n`, mas até `i`.\
-   Isso gera a soma: `1 + 2 + 3 + ... + n = n*(n+1)/2`.\
-   Como `n²/2` domina, a complexidade é **O(n²)**.

------------------------------------------------------------------------


