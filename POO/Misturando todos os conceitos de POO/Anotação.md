# Anotações de POO – Conceitos Básicos

## 1. Herança (Inheritance)

Herança é o mecanismo que permite criar uma **nova classe baseada em uma classe existente**, herdando seus atributos e métodos.

* Classe que herda: **subclasse / classe filha**
* Classe que é herdada: **superclasse / classe mãe**

### Exemplo em Java

```java
class Animal {
    void emitirSom() {
        System.out.println("Som genérico");
    }
}

class Cachorro extends Animal {
    void emitirSom() {
        System.out.println("Au Au!");
    }
}
```

**Explicação:**

* `Cachorro` herda `Animal` e **sobrescreve** o método `emitirSom()`.
* Evita repetição de código e organiza melhor o programa.

---

## 2. Polimorfismo (Polymorphism)

Polimorfismo é a capacidade de **usar um mesmo método de diferentes formas**, dependendo do objeto que o chama.

* Pode ser **sobrescrita (override)**: método na subclasse com mesma assinatura da superclasse.
* Pode ser **sobrecarga (overload)**: método com o mesmo nome, mas parâmetros diferentes.

### Exemplo de Sobrescrita

```java
Animal a1 = new Cachorro();
a1.emitirSom(); // Saída: "Au Au!"
```

### Exemplo de Sobrecarga

```java
class Calculadora {
    int somar(int a, int b) { return a + b; }
    double somar(double a, double b) { return a + b; }
}
```

**Explicação:**

* Sobrescrita → comportamento diferente dependendo da classe do objeto.
* Sobrecarga → mesmo método, parâmetros diferentes.

---

## 3. Encapsulamento (Encapsulation)

Encapsulamento é **proteger os dados de uma classe**, permitindo acesso controlado apenas por métodos específicos (`getters` e `setters`).

* Mantém os atributos `private`
* Métodos `public` para acessar ou modificar

### Exemplo

```java
class Pessoa {
    private String nome;
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
}
```

**Explicação:**

* Não podemos acessar `nome` diretamente de fora da classe.
* Métodos `getNome()` e `setNome()` permitem **controle e segurança**.

---

## Resumo Visual

| Conceito       | Objetivo                             | Exemplo                          |
| -------------- | ------------------------------------ | -------------------------------- |
| Herança        | Reutilizar código                    | `Cachorro extends Animal`        |
| Polimorfismo   | Método com comportamentos diferentes | `emitirSom()` ou `somar()`       |
| Encapsulamento | Proteger dados e controlar acesso    | `private nome + getters/setters` |
