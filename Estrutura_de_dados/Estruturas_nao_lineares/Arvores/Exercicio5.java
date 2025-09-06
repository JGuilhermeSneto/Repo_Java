package Estrutura_de_dados.Estruturas_nao_lineares.Arvores;

public class Exercicio5 {
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

    public No CriarNo(int valor){
        No novoNo = new No(valor);
        novoNo.valor = valor;
        novoNo.esquerda = null;
        novoNo.direita = null;
        return novoNo;
    }

    public No inserir(No no, int valor){
        if(no == null){
            return CriarNo(valor);
        }

        if(valor < no.valor){
            no.esquerda = inserir(no.esquerda, valor);
        }else{
            no.direita = inserir(no.direita, valor);
        }
        return no;
    }

    public static void preOrdem(No no){
        if(no != null){
            System.out.println(no.valor + "");
            preOrdem(no.esquerda);
            preOrdem(no.direita);
        }
    }

    public static void inOrdem(No no){
        if (no != null) {
            inOrdem(no.esquerda);
            System.out.println(no.valor + "");
            inOrdem(no.direita);
        }
    }

    public static void posOrdem(No no){
        if(no != null){
            posOrdem(no.esquerda);
            posOrdem(no.direita);
            System.out.println(no.valor + "");
        }
    }

    public static int altura(No no){
        if (no == null) {
            return 0;
        }
        int esq = altura(no.esquerda);
        int dir = altura(no.direita);
        return 1 + Math.max(esq, dir);

    }

    public boolean buscar(No no, int chave){
        if(no == null) return false;
        if(no.valor == chave) return true;
        if(chave < no.valor) return buscar(no.esquerda, chave);
        else return buscar(no.direita, chave);
    }


    public static void main(String[] args) {
        Exercicio5 arvore = new Exercicio5();
        No raiz = arvore.new No(10);
        raiz = null;

        int[] var = {10,5,15,3,7,20};

        for(int i = 0; i < var.length; i++){
            raiz = arvore.inserir(raiz, var[i]);
        }

        System.out.println("Pré-ordem");
        preOrdem(raiz);

        System.out.println("In-Ordem");
        inOrdem(raiz);

        System.out.println("Pós-ordem");
        posOrdem(raiz);

        System.out.println("Altura");
        System.out.println(altura(raiz) + "");

        System.out.println("Buscar 7: " + arvore.buscar(raiz,7));
        System.out.println("Buscar 8: " + arvore.buscar(raiz, 8));
    }

}
