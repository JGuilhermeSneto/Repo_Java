import java.util.Scanner;

public class grafo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        int[][] matriz = new int[20][20];
        int v1,v2;
        int v;

        System.out.println("Digite a quantidade de vértices: ");
        n = sc.nextInt();
        System.out.println("Digite a quantidade de arestas: ");
        m = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matriz[i][j] = 0;
            }
        }

        for (int i = 0; i < m; i++) {
            System.out.println("Digite a aresta (v1 v2): ");
            v1 = sc.nextInt() - 1;
            v2 = sc.nextInt() - 1;

            matriz[v1][v2] = 1;
            matriz[v2][v1] = 1;
        }

        System.out.println("Digite o vértice para verificar vizinhos: ");
        v = sc.nextInt() - 1;

        System.out.println("Vizinhos do vértice" + v + " :");
        for (int i = 0; i < n; i++) {
            if (matriz[v][i] == 1) {
                System.out.println(i + 1);
            }
        }
    }
}
