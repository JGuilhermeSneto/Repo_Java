package Estrutura_de_dados.Tabelas_Hash;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int valor;
        int chave;
        Scanner sc = new Scanner(System.in);

        int[] tabela = new int[10];
        for(int i = 0; i < tabela.length; i++){
            tabela[i] = -1;
        }
        System.out.println("Digite um valor: ");
        valor = sc.nextInt();
        chave = valor % 10;
        tabela[chave] = valor;

        if(tabela[chave] == valor){
            System.out.println("Valor encontrado!");
        }else{
            System.out.println("Valor não encontrado!");
        }
        sc.close();
    }
}
