import java.util.Scanner;

public class repita {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Digite um número:");
        int n = teclado.nextInt();
        int i = 1;

        do{
            System.out.println(i);
            i = i + 1;
        }while(i <= n);

        teclado.close();
    }
}
