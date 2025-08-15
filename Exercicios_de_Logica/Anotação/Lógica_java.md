# Lógica de Programação em Java

## O que é Lógica de Programação?

Lógica de programação é o **conjunto de regras e procedimentos** usados para resolver problemas através de algoritmos e códigos.

* Base para qualquer linguagem de programação.
* Ajuda a criar soluções organizadas e eficientes.

## Estruturas Básicas em Java

### 1. Variáveis e Tipos de Dados

```java
int idade = 25;         // Número inteiro
double salario = 3500.50; // Número decimal
String nome = "Zeka";    // Texto
boolean ativo = true;      // Verdadeiro ou falso
```

### 2. Estruturas Condicionais

```java
int idade = 18;
if (idade >= 18) {
    System.out.println("Maior de idade");
} else {
    System.out.println("Menor de idade");
}
```

### 3. Estruturas de Repetição

```java
// Laço for
for (int i = 0; i < 5; i++) {
    System.out.println("Número: " + i);
}

// Laço while
int j = 0;
while (j < 5) {
    System.out.println("Número: " + j);
    j++;
}
```

### 4. Funções / Métodos

```java
public class Main {
    static int somar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int resultado = somar(5, 3);
        System.out.println("Resultado: " + resultado);
    }
}
```

### 5. Arrays / Vetores

```java
int[] numeros = {1, 2, 3, 4, 5};
for (int n : numeros) {
    System.out.println(n);
}
```

## Dicas de Lógica

* Quebre o problema em **passos pequenos**.
* Use **fluxogramas** para planejar a solução.
* Teste cada parte do código separadamente.
* Sempre verifique **tipos de dados e limites**.

## Resumo Visual

| Conceito        | Descrição                                 | Exemplo                 |
| --------------- | ----------------------------------------- | ----------------------- |
| Variáveis       | Guardam dados                             | `int idade = 25;`       |
| Condicionais    | Decisões baseadas em condições            | `if/else`               |
| Repetição       | Executa código várias vezes               | `for` / `while`         |
| Funções/Métodos | Agrupa instruções em blocos reutilizáveis | `somar(a, b)`           |
| Arrays/Vetores  | Coleção de elementos do mesmo tipo        | `int[] numeros = {...}` |
