package Estrutura_de_dados.Tabelas_Hash;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] tabela = new String[10];
        String nome;
        int soma = 0;
        int chave;


        for(int i = 0; i < tabela.length; i++){
            tabela[i] = "";
        }

        System.out.println("Digite um nome: ");
        nome = sc.nextLine();

        for(int i = 0; i < nome.length();i++){
            soma += nome.charAt(i);
        }

        chave = soma % 10;
        tabela[chave] = nome;
        
        System.out.println("Nome armazenado na posição " + chave);
    }
}
