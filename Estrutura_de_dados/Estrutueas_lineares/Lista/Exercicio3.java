package Estrutura_de_dados.Estrutueas_lineares.Lista;

import java.util.Scanner;

public class Exercicio3 {
    static int [] lista = new int[20];
    static int tamanho = 5;

    public static void inicializarLista(){
        lista[0] = 15;
        lista[1] = 30;
        lista[2] = 45;
        lista[3] = 60;
        lista[4] = 75;
    }


    public static void main(String[] args) {

        inicializarLista(); 
        
        int buscar; 
        int achou = 0;
        int posicao = -1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número para buscar: ");

        buscar = sc.nextInt();

        for(int i = 1; i <= tamanho ; i++){
            if(lista[i] == buscar){
                posicao = i;
                break;
            }
        }

        if(posicao != -1){
            System.out.println("Elemento " + buscar + " encontrado na posição" + (posicao + 1) + ".");
        }else{
            System.out.println("Elemento não encontrado");
        }

        sc.close();
    }

}
