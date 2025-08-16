# 📌 Anotação – Programação Orientada a Objetos (POO) em Java  

A **POO** (Programação Orientada a Objetos) é um paradigma que organiza o código em torno de **objetos** e suas **responsabilidades**.  
Os 3 pilares mais importantes são:  

---

## 🔒 1. Encapsulamento
- É o princípio de **esconder os detalhes internos** de uma classe e expor apenas o necessário.  
- Isso é feito com **modificadores de acesso** (`private`, `protected`, `public`) e **métodos getters e setters**.  

📌 Exemplo simples:
```java
public class Pessoa {
    private String nome; // atributo encapsulado

    // getter
    public String getNome() {
        return nome;
    }

    // setter
    public void setNome(String nome) {
        this.nome = nome;
    }
}
🧬 2. Herança
Permite que uma classe herde atributos e métodos de outra, evitando repetição de código.

A palavra-chave usada é extends.

📌 Exemplo simples:

public class Funcionario extends Pessoa {
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
🎭 3. Polimorfismo
Permite que um mesmo método se comporte de formas diferentes, dependendo do objeto que o utiliza.

Tipos:

Sobreposição (Override) → redefinição de um método da classe pai.

Sobrecarga (Overload) → métodos com o mesmo nome, mas assinaturas diferentes.

📌 Exemplo simples (sobreposição):

public class Gerente extends Funcionario {
    @Override
    public double getSalario() {
        return super.getSalario() + 2000; // bônus de gerente
    }
}
🚀 Exemplo Completo (Encapsulamento + Herança + Polimorfismo)

// Classe base com Encapsulamento
class Pessoa {
    private String nome; // atributo privado

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void apresentar() {
        System.out.println("Olá, eu sou " + nome);
    }
}

// Classe que herda de Pessoa (Herança)
class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, double salario) {
        super(nome); // chama o construtor da classe pai
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    // Polimorfismo (sobrescrita do método)
    @Override
    public void apresentar() {
        System.out.println("Olá, eu sou " + getNome() + " e meu salário é R$ " + salario);
    }
}

// Classe que herda de Funcionario (Herança + Polimorfismo)
class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    // Polimorfismo (comportamento diferente)
    @Override
    public void apresentar() {
        System.out.println("Olá, eu sou o gerente " + getNome() + " e administro a equipe!");
    }
}

// Programa principal
public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Ana");          // só Pessoa
        Funcionario f = new Funcionario("João", 3000); // herança + encapsulamento
        Gerente g = new Gerente("Maria", 8000);       // herança + polimorfismo

        // Polimorfismo em ação
        p.apresentar();
        f.apresentar();
        g.apresentar();
    }
}
🔎 Saída esperada:

Olá, eu sou Ana
Olá, eu sou João e meu salário é R$ 3000.0
Olá, eu sou o gerente Maria e administro a equipe!