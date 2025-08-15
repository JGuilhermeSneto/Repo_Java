# Polimorfismo em POO

## O que é Polimorfismo?

Polimorfismo é um dos pilares da Programação Orientada a Objetos (POO) que permite **um mesmo método se comportar de formas diferentes**, dependendo do objeto que o chama.

* **Sobrescrita (Override)**: a subclasse altera o comportamento do método da superclasse.
* **Sobrecarga (Overload)**: métodos com o mesmo nome, mas diferentes parâmetros.

## Benefícios

* Flexibilidade no uso de métodos
* Reutilização de código
* Facilita manutenção e extensão de classes

## Exemplo de Sobrescrita em Java

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

## Exemplo de Sobrecarga em Java

```java
class Calculadora {
    int somar(int a, int b) { return a + b; }
    double somar(double a, double b) { return a + b; }
}

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println(calc.somar(2, 3));       // Saída: 5
        System.out.println(calc.somar(2.5, 3.5));   // Saída: 6.0
    }
}
```

## Explicação

* **Sobrescrita:** permite que métodos da superclasse sejam redefinidos na subclasse para comportamentos específicos.
* **Sobrecarga:** permite que métodos com o mesmo nome aceitem diferentes tipos ou números de parâmetros.

## Resumo Visual

| Conceito     | Objetivo                               | Exemplo                    |
| ------------ | -------------------------------------- | -------------------------- |
| Polimorfismo | Métodos com comportamentos diferentes  | `emitirSom()` ou `somar()` |
| Sobrescrita  | Redefinir método da superclasse        | `Cachorro.emitirSom()`     |
| Sobrecarga   | Mesmo método com parâmetros diferentes | `Calculadora.somar()`      |
