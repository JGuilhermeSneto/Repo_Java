package Estrutura_de_dados.Estrutueas_lineares.Fila;

public class Exercicio2 {
    public class exercicio1 {
    static int[] fila = new int[10];
    static int frente = 0;
    static int tras = 0;

    public static void Enqueue(int valor) {
        if (tras < fila.length) {
            fila[tras] = valor;
            tras++;
            System.out.println("Adicionado " + valor + " à fila.");
        } else {
            System.out.println("Fila cheia!");
        }
    }
    
    public static int Dequeue() {
        if (frente < tras) {
            int valor = fila[frente];
            frente++;
            return valor;
        } else {
            System.out.println("Fila vazia!");
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enfileirando 5 elementos:");
        for(int i = 1; i <= 5; i++) {
            Enqueue(i * 10);
        }
        
        System.out.println("\nFila depois de enfileirar:");
        for(int i = frente; i < tras; i++) {
            System.out.print(fila[i] + " ");
        }
        System.out.println();

        System.out.println("\nRemovendo 2 elementos:");
        System.out.println("Removido: " + Dequeue());
        System.out.println("Removido: " + Dequeue());

        System.out.println("\nFila depois de desenfileirar:");
        for(int i = frente; i < tras; i++) {
            System.out.print(fila[i] + " ");
        }
        System.out.println();
    }
}
}
