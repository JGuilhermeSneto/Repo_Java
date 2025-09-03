package Estrutura_de_dados.Tabelas_Hash;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabela = new int[10];
        int valor;
        int pos;

        for(int i = 0 ; i < tabela.length; i++){
            tabela[i] = -1;
        }

        for(int i = 0; i <5; i++){
            System.out.println("Digite um valor: ");
            valor = sc.nextInt();
            pos = valor % 10;
            while (tabela[pos] != -1) {
                pos = (pos + 1) % 10;
            }
            tabela[pos] = valor;
        }

        System.out.println("Tabela preenchida: ");
        for(int i = 0; i < tabela.length; i++){
            System.out.println(tabela[i] + "");
        }
        sc.close();
    }
}
