package Estrutura_de_dados.Estrutueas_lineares.Fila;

public class Exercicio3 {
    int[] fila = new int[10];
    static int frente = 1;
    static int tras = 0;

    public static boolean Vazio(){
        return frente < tras;
    }

    public static void main(String[] args) {
        if (Vazio()) {
            System.out.println("Fila Vazia");
        }else{
            System.out.println("Fila com elementos");
        }
    }
}
