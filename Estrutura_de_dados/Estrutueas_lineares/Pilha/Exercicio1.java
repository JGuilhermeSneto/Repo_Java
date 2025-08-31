package Estrutura_de_dados.Estrutueas_lineares.Pilha;

public class Exercicio1 {
    static int[] pilha = new int[10];
    static int topo = 0;
    public static void main(String[] args) {
        pilha[1] = 10;
        pilha[2] = 20;
        pilha[3] = 30;
        pilha[4] = 40;
        pilha[5] = 50;
        topo = 5;

        System.out.println("Elementos na pilha");
        for(int i = topo; i >= 1;i--){
            System.out.println(pilha[i] + "");
        }
    }
}
