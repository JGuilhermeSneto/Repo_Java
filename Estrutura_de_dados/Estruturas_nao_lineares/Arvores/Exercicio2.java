package Estrutura_de_dados.Estruturas_nao_lineares.Arvores;

public class Exercicio2 {
    class No{
      int valor;
      No esquerda;
      No direita;
      
      No(int valor){
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
      }
    }

    public static void inOrdem(No no){
        if(no != null){
            inOrdem(no.esquerda);
            System.out.println(no.valor);
            inOrdem(no.direita);
        }
    }

    public static void main(String[] args) {
        Exercicio2 arvore = new Exercicio2();
        No raiz = arvore.new No(10);
        
        raiz.esquerda = arvore.new No(5);
        raiz.direita = arvore.new No(15);

        raiz.esquerda.esquerda = arvore.new No(3);
        raiz.esquerda.direita = arvore.new No(7);
        raiz.direita.direita = arvore.new No(20);

        System.out.println("Percuso in-Ordem");
        
        inOrdem(raiz);

    }
    

}
