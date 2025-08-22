# **Anotações sobre Streams e Lambdas em Java**

## **1. O que são Lambdas?**
As **expressões Lambda** foram introduzidas no **Java 8** e permitem criar **funções anônimas** (sem nome), reduzindo código e tornando-o mais funcional.

### **Sintaxe:**
```java
(parâmetros) -> { corpo }
Exemplo:
Antes do Java 8:

List<String> nomes = Arrays.asList("Ana", "Pedro", "Lucas");

Collections.sort(nomes, new Comparator<String>() {
    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2);
    }
});


Com Lambda:

List<String> nomes = Arrays.asList("Ana", "Pedro", "Lucas");

nomes.sort((s1, s2) -> s1.compareTo(s2));
Principais Interfaces Funcionais para Lambdas
Runnable – Executa um bloco de código.

Comparator<T> – Compara dois objetos.

Predicate<T> – Testa uma condição (test(T) retorna boolean).

Consumer<T> – Consome um valor (accept(T)).

Function<T, R> – Transforma um valor (apply(T) retorna R).

Supplier<T> – Fornece um valor (get() retorna T).

BinaryOperator<T> – Recebe dois valores e retorna um resultado.

2. O que são Streams?
A Stream API (Java 8) permite trabalhar com coleções de forma declarativa, aplicando operações de filtro, transformação e agregação.

Fluxo de uma Stream
Criação da Stream (a partir de listas, arrays, etc.)

Operações intermediárias (filter, map, sorted, distinct, limit, skip)

Operação terminal (forEach, collect, reduce, count)

Exemplo básico:

List<String> nomes = Arrays.asList("Ana", "Pedro", "Amanda", "Lucas");

nomes.stream()
     .filter(n -> n.startsWith("A"))  // Filtra os que começam com A
     .map(String::toUpperCase)        // Converte para maiúsculo
     .sorted()                        // Ordena
     .forEach(System.out::println);   // Imprime
Principais Métodos da Stream
filter(Predicate) → Filtra elementos.

map(Function) → Transforma os elementos.

sorted() → Ordena.

distinct() → Remove duplicatas.

limit(n) → Pega os primeiros n elementos.

skip(n) → Ignora os primeiros n elementos.

forEach(Consumer) → Itera sobre os elementos.

collect(Collectors.toList()) → Coleta resultado em uma lista.

reduce(identity, BinaryOperator) → Reduz a um único valor.

count() → Conta elementos.

Exemplo com operações numéricas:

List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

int somaPares = numeros.stream()
                       .filter(n -> n % 2 == 0)
                       .map(n -> n * n)
                       .reduce(0, Integer::sum);

System.out.println("Soma dos quadrados pares: " + somaPares);
3. Diferença entre Lambdas e Streams
Lambdas: Sintaxe curta para funções anônimas.

Streams: Processamento funcional de coleções de dados (muitas vezes utilizando Lambdas).

4. Benefícios
Código mais conciso e legível.

Facilita programação funcional em Java.

Melhor performance em operações com grandes coleções (Stream paralela).

5. Referências
Documentação Oficial Java Streams

Documentação Oficial Java Lambdas