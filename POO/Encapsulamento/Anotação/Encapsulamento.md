# Encapsulamento em POO

## O que é Encapsulamento?

Encapsulamento é um dos pilares da Programação Orientada a Objetos (POO) que **protege os dados de uma classe**, permitindo que apenas métodos específicos possam acessá-los ou modificá-los.

* Atributos geralmente são declarados como `private`.
* Métodos `public` são usados para **ler** (getters) ou **alterar** (setters) os valores.

## Benefícios

* Proteção de dados
* Controle sobre valores atribuídos
* Facilita manutenção e evita erros

## Exemplo em Java

```java
class Pessoa {
    private String nome;
    private int idade;

    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para nome
    public String getNome() {
        return this.nome;
    }

    // Setter para idade
    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        }
    }

    // Getter para idade
    public int getIdade() {
        return this.idade;
    }
}

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Zeka");
        pessoa.setIdade(25);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}
```

## Explicação

* `private String nome` e `private int idade`: atributos protegidos.
* `setNome` e `setIdade`: permitem controlar os valores que são atribuídos.
* `getNome` e `getIdade`: permitem ler os valores de forma segura.

## Resumo

| Conceito       | Objetivo                          | Exemplo                     |
| -------------- | --------------------------------- | --------------------------- |
| Encapsulamento | Proteger dados e controlar acesso | `private` + getters/setters |
