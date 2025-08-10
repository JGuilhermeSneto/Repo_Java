import java.util.Scanner;

public class procedimento {
    
    public static void fibonacchi(int n) {
       
        int a = 0;
        int b = 1;
        int c;
        
        System.out.println("Sequencia de fibonacci com" + n + "termos:");
        System.out.println(a + "" + b +"") ;

        for(int i = 3; i <= n; i++){
            c = a + b;
            System.out.println(c +"");

            a = b;
            b = c;
        }
        System.out.println();


    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite quantos termos voce quer:");

        int termos = teclado.nextInt();


        fibonacchi(termos);

        teclado.close();        
    }
}
