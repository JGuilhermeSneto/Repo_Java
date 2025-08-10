package Exercicios;
import java.util.Scanner;

public class enquanto {
    public static void main(String[] args) {
        System.out.println("Digite um número:");

        int i,n;


        i = 1;


        Scanner teclado = new Scanner(System.in);

        n = teclado.nextInt();

        while(i <= n){
            System.out.println(i);
            i++;
        }
        teclado.close();
    }
}
