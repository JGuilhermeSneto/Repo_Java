package Estrutura_de_dados.Estrutueas_lineares.Fila;

public class Exercicio5 {
   
    private int[] fila;
    private int frente;
    private int tras;
    private int tamanho;


    public Exercicio5(int capacidade) {
       
        this.tamanho = capacidade + 1;
        this.fila = new int[this.tamanho];
        this.frente = 0;
        this.tras = 0;
    }


    public void enqueue(int valor) {
        if ((this.tras + 1) % this.tamanho == this.frente) {
            System.out.println("Fila cheia!");
            return;
        }

        this.tras = (this.tras + 1) % this.tamanho;
        this.fila[this.tras] = valor;
    }

    public int dequeue() {
        if (this.frente == this.tras) {
            return -1;
        }
        this.frente = (this.frente + 1) % this.tamanho;
        int valor = this.fila[this.frente];
        return valor;
    }


    public boolean isEmpty() {
        return this.frente == this.tras;
    }

    public static void main(String[] args) {
      
        Exercicio5 minhaFila = new Exercicio5(4);

        System.out.println("Enfileirando 4 elementos...");
        minhaFila.enqueue(10);
        minhaFila.enqueue(20);
        minhaFila.enqueue(30);
        minhaFila.enqueue(40);

        System.out.print("Fila atual: ");
        
        
        while (!minhaFila.isEmpty()) {
            System.out.print(minhaFila.dequeue() + " ");
        }
        System.out.println();
    }
}