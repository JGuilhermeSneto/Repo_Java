
# **Java Collections – Guia Completo**

## **1. O que é a Java Collections Framework (JCF)?**
A **Java Collections Framework (JCF)** é um conjunto de **interfaces, classes e algoritmos** para manipulação de **grupos de objetos** em Java.

- Localizada no pacote **`java.util`**.
- Facilita o armazenamento, busca, ordenação e manipulação de dados.
- Baseada em **Interfaces** (List, Set, Map, Queue).

---

## **2. Estrutura Principal**
```
Collection (interface raiz)
 ├── List      (Ordenada, permite duplicatas)
 ├── Set       (Não ordenada, não permite duplicatas)
 └── Queue     (Fila - FIFO)
Map (interface separada)
 ├── HashMap
 ├── LinkedHashMap
 └── TreeMap
```

---

## **3. INTERFACE LIST**
- **Mantém ordem de inserção**.
- **Permite elementos duplicados**.
- **Acesso por índice**.

### **Implementações:**
- `ArrayList` → Rápido para leitura e acesso.
- `LinkedList` → Bom para inserções/remoções frequentes.
- `Vector` → Similar ao `ArrayList`, mas sincronizado (legado).

### **Exemplo com ArrayList:**
```java
import java.util.ArrayList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        // add() - adiciona elementos
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Ana"); // Permite duplicatas

        // get() - acessa por índice
        System.out.println("Primeiro nome: " + nomes.get(0));

        // contains() - verifica se existe
        System.out.println("Tem Carlos? " + nomes.contains("Carlos"));

        // remove() - remove elemento
        nomes.remove("Ana");

        // size() - quantidade de elementos
        System.out.println("Total: " + nomes.size());

        // Iteração
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
```

---

## **4. INTERFACE SET**
- **Não permite duplicatas**.
- **Não possui índice**.
- Bom para verificar **existência de elementos rapidamente**.

### **Implementações:**
- `HashSet` → Não garante ordem, rápido.
- `LinkedHashSet` → Mantém ordem de inserção.
- `TreeSet` → Mantém elementos ordenados automaticamente.

### **Exemplo com HashSet:**
```java
import java.util.HashSet;
import java.util.Set;

public class ExemploSet {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();

        // add()
        numeros.add(10);
        numeros.add(5);
        numeros.add(10); // Ignorado (duplicata)

        // contains()
        System.out.println("Contém 5? " + numeros.contains(5));

        // remove()
        numeros.remove(10);

        // size()
        System.out.println("Quantidade: " + numeros.size());

        // Iteração
        for (int n : numeros) {
            System.out.println(n);
        }
    }
}
```

---

## **5. INTERFACE MAP**
- **Armazena pares chave-valor**.
- **Chaves únicas**, valores podem se repetir.
- Não implementa `Collection`, é separado.

### **Implementações:**
- `HashMap` → Não garante ordem, rápido.
- `LinkedHashMap` → Mantém ordem de inserção.
- `TreeMap` → Ordena pelas chaves.

### **Exemplo com HashMap:**
```java
import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args) {
        Map<String, Integer> idades = new HashMap<>();

        // put() - adiciona ou atualiza
        idades.put("Ana", 25);
        idades.put("Carlos", 30);
        idades.put("Ana", 28); // Atualiza valor da chave Ana

        // get() - obtém valor pela chave
        System.out.println("Idade da Ana: " + idades.get("Ana"));

        // containsKey()
        System.out.println("Existe Carlos? " + idades.containsKey("Carlos"));

        // remove()
        idades.remove("Carlos");

        // size()
        System.out.println("Quantidade: " + idades.size());

        // keySet() e values()
        for (String nome : idades.keySet()) {
            System.out.println(nome + " tem " + idades.get(nome) + " anos");
        }
    }
}
```

---

## **6. QUANDO USAR CADA UM?**

| Estrutura | Quando usar                                                                 |
|-----------|-----------------------------------------------------------------------------|
| **List**  | Ordem importa, aceita duplicatas, precisa acessar por índice.              |
| **Set**   | Precisa evitar duplicatas e verificar existência rapidamente.              |
| **Map**   | Precisa associar **chave → valor** e acessar valores rapidamente.         |

---

## **7. Boas Práticas**
- Use **interfaces** (`List`, `Set`, `Map`) no código e não implementações diretas (`ArrayList`, `HashSet`, etc.).
- Escolha a implementação certa conforme a **necessidade de ordem, performance e restrição de duplicatas**.
- Prefira `HashMap` e `HashSet` para **performance**, `TreeMap` e `TreeSet` para **ordenação**.
