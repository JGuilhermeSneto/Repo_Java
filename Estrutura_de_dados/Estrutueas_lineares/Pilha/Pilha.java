package Estrutura_de_dados.Estrutueas_lineares.Pilha;

public class Pilha{
    private int[] pilha = new int[10];
    private int topo;

    public Pilha(int tamanho){
        this.pilha = new int [tamanho];
        this.topo = 0;
    }

    public boolean Vazio(){
        return this.topo == 0;
    }

    public static void main(String[] args) {
        Pilha minPilha = new Pilha(10);
        if (minPilha.Vazio()) {
            System.out.println("A pilha está vazia!");
        }else{
            System.out.println("A pilha tem elementos");
        }
    }
}
