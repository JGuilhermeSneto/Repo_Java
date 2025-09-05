package Estrutura_de_dados.Estruturas_nao_lineares.Arvores;

public class Exercicio1 {
    class No{
        int valor;
        No direita;
        No esquerda;

        No(int valor){
            this.valor = valor;
            this.esquerda = null;
            this.direita = null;
        }

    }

    public static void main(String[] args) {
        Exercicio1 arvore = new Exercicio1();
        No raiz = arvore.new No(10);

        raiz.esquerda = arvore.new No(5);
        raiz.direita = arvore.new No(15);

        raiz.esquerda.esquerda = arvore.new No(3);
        raiz.esquerda.direita = arvore. new No(7);

        raiz.direita.direita = arvore.new No(20);
        System.out.println("Pré-ordem");

        arvore.preOrdem(raiz);
    }

    void preOrdem(No no){
        if (no != null) {
            System.out.println(no.valor + "");
            preOrdem(no.esquerda);
            preOrdem(no.direita);
        }
    }

}
