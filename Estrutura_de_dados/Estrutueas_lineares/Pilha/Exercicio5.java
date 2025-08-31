package Estrutura_de_dados.Estrutueas_lineares.Pilha;

import java.util.Scanner;

public class Exercicio5 {
    static int[] pilha = new int[10];
    static int topo = -1;

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 5; i++){
            System.out.println("Digite o "+ (i + 1) + "números: ");
            topo++;
            int numero = sc.nextInt();
            pilha[topo] = numero;
        }

        System.out.println("Sequencia invertida: ");
        while (topo > 0) {
            System.out.println(pilha[topo]);
            topo--;
        }
        sc.close();
    }

}
