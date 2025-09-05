package Estrutura_de_dados.Estruturas_nao_lineares.Arvores;

public class Exercicio4 {
    class No{
        int valor;
        No esquerda;
        No direita;

        No(int valor){
            this.valor = valor;
            this.direita = null;
            this.esquerda = null;
        }
    }

    public static boolean buscar(No no, int chave){
        if ( no == null) {
            return false;
        }

        if (no.valor == chave) {
            return true;
        }else if(chave < no.valor){
            return buscar(no.esquerda, chave);
        }else{
            return buscar(no.direita, chave);
        }
    }

    public static void main(String[] args) {
        Exercicio4 arvore = new Exercicio4();
        No raiz = arvore.new No(10);
        
        raiz.esquerda = arvore.new No(5);
        raiz.direita = arvore. new No(15);
        
        raiz.esquerda.esquerda = arvore.new No(3);
        raiz.esquerda.direita = arvore.new No(7);
        raiz.direita.direita = arvore. new No(20);

        System.out.println("Buscar 7: " + buscar(raiz, 7));
        System.out.println("Buscar 8: " + buscar(raiz, 8));
    }
}
