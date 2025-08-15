# Herança em POO

## O que é Herança?

Herança é um dos pilares da Programação Orientada a Objetos (POO) que permite **uma classe herdar atributos e métodos de outra classe**, promovendo reutilização de código.

* **Superclasse / Classe mãe**: fornece atributos e métodos.
* **Subclasse / Classe filha**: herda os atributos e métodos da superclasse e pode adicionar novos ou sobrescrever existentes.

## Benefícios

* Reutilização de código
* Organização e hierarquia de classes
* Facilita manutenção

## Exemplo em Java

```java
class Animal {
    void emitirSom() {
        System.out.println("Som genérico");
    }
}

class Cachorro extends Animal {
    @Override
    void emitirSom() {
        System.out.println("Au Au!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Cachorro();

        animal1.emitirSom(); // Saída: Som genérico
        animal2.emitirSom(); // Saída: Au Au!
    }
}
```

## Explicação

* `Cachorro` herda `Animal` e **sobrescreve** o método `emitirSom()`.
* Permite que subclasses tenham comportamento específico sem duplicar código da superclasse.

## Resumo Visual

| Conceito    | Objetivo                       | Exemplo                   |
| ----------- | ------------------------------ | ------------------------- |
| Herança     | Reutilizar código e organizar  | `Cachorro extends Animal` |
| Superclasse | Classe que fornece atributos   | `Animal`                  |
| Subclasse   | Classe que herda e especializa | `Cachorro`                |
