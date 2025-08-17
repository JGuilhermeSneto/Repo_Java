package POO.exercicios;

import java.util.ArrayList;
import java.util.List;

public class ProdutoPOO {
    private String nome;
    private double preco;

    public ProdutoPOO(String nome, double preco) {
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

    static class Livro extends ProdutoPOO{
        public Livro(String nome, double preco){
            super(nome,preco);
        }

        public void descricao(){
            System.out.println("Livro" + getNome() + "-R$" + getPreco());
        }
    }

    static class Eletronico extends ProdutoPOO{
        public Eletronico(String nome,double preco){
            super(nome, preco);
        }

        public void descricao(){
            System.out.println("Eletrônico:" + getNome() + "-R$" + getPreco());
        }
    }
    public static void main(String[] args) {
        List<ProdutoPOO> Produtos = new ArrayList<>();

        Produtos.add(new Livro("Core Java", 1440.50));
        Produtos.add(new Eletronico("Dell", 2999.99));

        for (ProdutoPOO produtos : Produtos) {
            produtos.descricao();
        }
    } 
    
}
