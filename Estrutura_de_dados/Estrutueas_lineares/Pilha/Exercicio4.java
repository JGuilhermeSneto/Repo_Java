package Estrutura_de_dados.Estrutueas_lineares.Pilha;

public class Exercicio4 {
    static int[] pilha = new int[10];
    static int topo ;


    public static void Push(int valor){
        if (topo < pilha.length) {
            pilha[topo] = valor;
            topo++;
        }
    }

    public static int TopoPilha(){
        if (topo > 0) {
            return pilha[topo - 1];
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        Push(10);
        Push(20);
        Push(30);
        
        System.out.println("Topo da pilha: " + TopoPilha());
    }
}
