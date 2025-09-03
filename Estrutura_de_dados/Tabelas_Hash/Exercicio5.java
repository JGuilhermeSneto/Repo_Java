package Estrutura_de_dados.Tabelas_Hash;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] tabela = new String[10];
        int chave;
        int indice;
        String nome;

        for(int i = 0; i < tabela.length; i++){
            tabela[i] = "";
        }

        System.out.println("Digite uma chave numérica: ");
        chave = sc.nextInt();
        
        sc.nextLine();

        System.out.println("Digite um nome: ");
        nome = sc.nextLine();

        indice = chave % 10;
        tabela[indice] = nome;

        System.out.println("Digite uma chave pra buscar: ");
        int chaveBusca = sc.nextInt();
        int indiceBusca = chaveBusca % 10;

        if (!tabela[indiceBusca].equals("")) {
            System.out.println("valor encontrado" + tabela[indiceBusca]);
        }else{
            System.out.println("Não encontrado");
        }
        sc.close();
    }
}
