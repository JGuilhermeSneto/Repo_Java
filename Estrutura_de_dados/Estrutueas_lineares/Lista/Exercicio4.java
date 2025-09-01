package Estrutura_de_dados.Estrutueas_lineares.Lista;

import java.util.Scanner;

public class Exercicio4 {
    static int[] lista = new int[20];
    static int tamanho = 5;

    public static void inicioLista(){
        lista[0] = 10;
        lista[1] = 20;
        lista[2] = 30;
        lista[3] = 40;
        lista[4] = 50;

    }

    public static void main(String[] args) {

        inicioLista();

        Scanner sc = new Scanner(System.in);
        int posicao;
        int valor;

        System.out.println("Digite a posição do para inserir(1 até" + tamanho + 1 +"):");
        posicao = sc.nextInt();
        System.out.println("Digite o valor: ");
        valor = sc.nextInt();

        int indice = posicao - 1;
        if(posicao >=1 && indice <= tamanho + 1 ){
            for(int i = tamanho; i>= indice; i-- ){
                lista[i] = lista[i - 1];
            }
            lista[posicao] = valor;
            tamanho++;
        }else{
            System.out.println("Posição inválida");
        }

        System.out.println("Lista após inserção");
        for(int i = 1 ; i <= tamanho; i++){
            System.out.println(lista[i] + "");
        }

    }
}
