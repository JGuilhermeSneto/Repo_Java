package Exercicios;
import java.util.Scanner;

public class para {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.println("Digite um número:");

        n = teclado.nextInt();

        for(int i = 0; i <= n; i++){
            System.out.println(i);
        }
        teclado.close();
    }
}
