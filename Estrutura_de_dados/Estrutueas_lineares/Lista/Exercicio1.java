package Estrutura_de_dados.Estrutueas_lineares.Lista;

import java.util.Scanner;

public class Exercicio1 {
    static int[] lista = new int[20];
    static int tamanho = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;


        for(int i = 1; i <= 5 ; i++){
            System.out.println("Digite um valor:");
            valor = sc.nextInt();
            tamanho = tamanho + 1;
            lista[tamanho] = valor;
        }

        System.out.println("Elementos na lista! ");
        for(int i = 1 ; i <= 5 ; i++){
            System.out.println(lista[i] + "");
        }

        sc.close();
    }
}
