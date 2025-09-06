import java.util.Scanner;

public class Exercicio1 {


    public static void main(String[] args) {
            
        int v1,v2;
        int[][] matriz = new int[20][20];

        int n,m;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de vértices: ");
        n = sc.nextInt();
        System.out.println("Digite a quantidade de arestas: ");
        m = sc.nextInt();

        for(int i = 0; i < n;i ++){
            for(int j = 0; j < n ; j++){
                matriz[i][j] = 0;
            }
        }

        for(int i = 0; i < m; i++){
            System.out.println("Digite a aresta (v1 v2): ");
            v1 = sc.nextInt() - 1;
            v2 = sc.nextInt() - 1;

            matriz[v1][v2] = 1;
            matriz[v2][v1] = 1;
        }

        System.out.println("Matriz de Adjcência: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
