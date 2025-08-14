package POO.Heranca;

public class Animal {
    String nome;
    int idade;

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    
   


    public void emitirSom(){
        System.out.println("O animal faz um som aí");
    }


    
    static class Mamifero extends Animal{

        String corPelo;
        public Mamifero(String nome, int idade, String corPelo) {
            super(nome, idade);
            this.corPelo = corPelo;
        }

        public void emitirSom(){
            System.out.println("som de mamiferos!");
        }
        
    }

    static class Reptil extends Animal{
        String temCorporal;

        public Reptil(String nome, int idade, String temCorporal){
            super(nome,idade);
            this.temCorporal = temCorporal;
        }


        public void emitirSom(){
            System.out.println("Som de reptil!");
        }


    }


    public static void main(String[] args) {
       Mamifero cachorro = new Mamifero("Trex", 1, "branco e marrom");
       Reptil cobrita = new Reptil("xuxa", 2, "40°");
       
       
        cachorro.emitirSom();
        cobrita.emitirSom();


    }


    
}
