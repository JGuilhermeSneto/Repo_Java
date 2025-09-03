package Estrutura_de_dados.Tabelas_Hash;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabela = new int[10];
        int chave;
        int valor;

        for(int i = 0; i < tabela.length; i++){
            tabela[i] = -1;
        }

        System.out.println("Digite um valor: ");
        valor = sc.nextInt();

        chave = valor % 10;
        tabela[chave] = valor;

        System.out.println("Digite um valor para remover: ");
        valor = sc.nextInt();
        chave = valor % 10;

        if(tabela[chave] == valor){
            tabela[chave] = -2;
            System.out.println("Removido!");
        }else{
           System.out.println("Valor não encontrado!"); 
        }

        
    }
}
