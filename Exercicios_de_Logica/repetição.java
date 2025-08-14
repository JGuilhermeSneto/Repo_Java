package Exercicios_de_Logica;
import java.util.Scanner;

public class repetição {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número inicial:");
        int inicio = teclado.nextInt();

        System.out.println("Digite um número final:");
        int fim = teclado.nextInt();

        System.out.println("Digite o valor do passo:");
        int passo = teclado.nextInt();

        if(passo == 0){
            passo = 1;
        }

        if(inicio <= fim){
            for(int i = inicio; i < fim; i += passo){
                System.out.println(i);
            }
        }
        else{
            for(int i = inicio; i > fim ; i-=passo){
                System.out.println(i);
            }
        }
        System.out.println();


        teclado.close();
    }
}
