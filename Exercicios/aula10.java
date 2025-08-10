package Exercicios;
import java.util.Scanner;

public class aula10{
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);


    System.out.println("Digite o valor inicial:");
    int iniciarContador = teclado.nextInt();

    System.out.println("Digite o valor final:");
    int fimContador = teclado.nextInt();


    System.out.println("Digite o valor do passo:");
    int passo = teclado.nextInt();


    if(passo <=0){
        System.out.println("Passo invalido. Usando passo = 1\n");
        passo = 1;
    }
    

    if(iniciarContador < fimContador){
        for(int i = iniciarContador; i <= fimContador;i = i + passo){
            System.out.println(i + "");
        }
    }else{
        for(int i = iniciarContador; i >= fimContador; i = i - passo){
            System.out.println(i + "");
        }
    }
    



















    teclado.close();
    }
}