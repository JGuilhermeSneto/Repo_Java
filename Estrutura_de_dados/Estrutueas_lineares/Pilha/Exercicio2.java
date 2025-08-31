package Estrutura_de_dados.Estrutueas_lineares.Pilha;


public class Exercicio2 {
    static int[] pilha = new int[10];
    static int topo = 0;

    public static void push(int valor){
        if (topo < 10) {
            topo += topo;
            pilha[topo] = valor;
        }else{
            System.out.println("Pilha cheia !");
        }
    }

    public static int pop(){
        if (topo > 0) {
            topo -= topo;
            return pilha[topo + 1];
        }else{
            System.out.println("Pilha vazia! ");
            return -1;
        }
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);

        System.out.println("Pilha antes do topo");
        for(int i = topo; i > 1; i--){
            System.out.println(pilha[i] + "");
        }

        pop();
        pop();

        System.out.println("Pilha depois do topo!");
        for(int i = topo; i >= 1; i--){
            System.out.println(pilha[i] + "");
        }
    }

}
