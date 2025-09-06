import java.util.Scanner;

public class grafo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        int[][] matriz = new int[20][20];
        boolean completo;
        int v1, v2;

        System.out.print("Digite a quantidade de vértices: ");
        n = sc.nextInt();
        System.out.print("Digite a quantidade de arestas: ");
        m = sc.nextInt();


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = 0;
            }
        }

 
        for (int i = 0; i < m; i++) {
            System.out.print("Digite a aresta (v1 v2) : ");
            v1 = sc.nextInt() - 1;
            v2 = sc.nextInt() - 1;

            matriz[v1][v2] = 1;
            matriz[v2][v1] = 1;
        }


        completo = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && matriz[i][j] == 0) {
                    completo = false;
                    break;
                }
            }
            if (!completo) break;
        }

        if (completo) {
            System.out.println("O grafo é completo");
        } else {
            System.out.println("O grafo é incompleto");
        }

        sc.close();
    }
}
