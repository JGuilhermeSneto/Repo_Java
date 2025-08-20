package POO.Exercicios_2;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public void mostrar(){
        System.out.println(nome + " - R$ " + preco + "\n");
    }

    public static void main(String[] args) {
        Produto[] lista = new Produto[3];

        lista[0] = new Produto("Mochila", 150.99);
        lista[1] = new Produto("Borracha", 2.20);
        lista[2] = new Produto("Livro", 30.90);

        for(int i = 0 ; i < lista.length; i++){
            lista[i].mostrar();
        }
        
    }
}
