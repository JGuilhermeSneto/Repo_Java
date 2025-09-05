package Estrutura_de_dados.Estruturas_nao_lineares.Arvores;

public class Exercicio3 {
    class No{
        int valor;
        No direita;
        No esquerda;

        No(int valor){
            this.valor = valor;
            this.direita = null;
            this.esquerda = null;
        }
    }

    public static int altura(No no){
        if(no == null){
            return 0;
        }else{
            int alturEsq = altura(no.esquerda);
            int alturDir = altura(no.direita);
            if(alturEsq > alturDir){
                return alturEsq + 1;
            }else{
                return alturDir + 1;
            }
        }
    }

    public static void main(String[] args) {
        Exercicio3 arvore = new Exercicio3();
        No raiz = arvore.new No(10);

        raiz.esquerda = arvore.new No(5);
        raiz.direita = arvore.new No(15);

        raiz.esquerda.esquerda = arvore.new No(3);
        raiz.esquerda.direita = arvore.new No(7);
        raiz.direita.direita = arvore.new No(20);

        System.out.println("Altura da Árvore: " + altura(raiz));
        
    }    
}
