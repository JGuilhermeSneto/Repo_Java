package Estrutura_de_dados.Estrutueas_lineares.Lista;

import java.util.Scanner;

public class Exercicio2 {
    static int[] lista = new int[20];
    static int tamanho = 5;

    public static void iniciarLista(){
        lista[0] = 10;
        lista[1] = 20;
        lista[2] = 30;
        lista[3] = 40;
        lista[4] = 50;
    }

    public static void main(String[] args) {

        iniciarLista();
        System.out.println("Lista de números: ");
        imprimirLista();

        Scanner sc = new Scanner(System.in);
        int remover;
        System.out.println("Digte um valor para remover");
        remover = sc.nextInt();

        int posicao = -1;

        for(int i = 1; i <= tamanho ; i++){
            if (lista[i] == remover) {
                posicao = i;
                break;
            }
        }

        if(posicao != -1){
            for(int i = posicao ; i < tamanho; i++){
                lista[i] = lista[i + 1];
                tamanho--;
                System.out.println("Elemento " + remover+ "removido com sucesso!");
            }
        }else{
            System.out.println("Elemento não encontrado");
        }

        System.out.println("Lista atualizada: ");
        imprimirLista();
        sc.close();
    }

    public static void imprimirLista() {
        for(int i = 0; i < tamanho ; i++){
            System.out.println(lista[i]);
        }
    }
        
}
