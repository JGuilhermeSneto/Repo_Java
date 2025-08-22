package POO.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }


    public void descricao(){
        System.out.println("Produto:" +nome + " -R$ " + preco);

    }

    static class Livro extends Produto{
        public Livro(String nome, double preco){
            super(nome,preco);
        }

        public void descricao(){
             System.out.println("Livro: %s - R$ %2.f" + getNome() + getPreco());
        }
        
    }

    static class Eletronico extends Produto{
        public Eletronico(String nome,double preco){
            super(nome, preco);
        }

        public void descricao(){
            System.out.println("Eletrônico: %s - R$ %2.f" + getNome() + getPreco());
        }
    }
    public static void main(String[] args) {
        List<Produto> Produto = new ArrayList<>();

        Produto.add(new Livro("Core Java", 1440.50));
        Produto.add(new Eletronico("Dell", 2999.99));

        for (Produto produtos : Produto) {
            produtos.descricao();
        }
    } 
    
}
