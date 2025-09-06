import java.util.Scanner;

public class grafo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de vértices: ");
        int n = sc.nextInt();  
        System.out.print("Digite a quantidade de arestas: ");
        int m = sc.nextInt();  

        int[][] matriz = new int[n][n];   
        boolean[] visitado = new boolean[n]; 
        int[] fila = new int[n];         
        int frente = 0, tras = 0;        
        int v1, v2;                      
        int inicio, atual;                
 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = 0;
            }
            visitado[i] = false; 
        }

 
        for (int i = 0; i < m; i++) {
            System.out.print("Digite a aresta (v1 v2): ");
            v1 = sc.nextInt() - 1;  
            v2 = sc.nextInt() - 1;

            matriz[v1][v2] = 1; 
            matriz[v2][v1] = 1;
        }

        System.out.print("Digite o vértice inicial: ");
        inicio = sc.nextInt() - 1;

        fila[tras] = inicio;
        visitado[inicio] = true;

        while (frente <= tras) { 
            atual = fila[frente]; 
            frente++;           
            System.out.println("Visitando " + (atual + 1)); 
            
            for (int i = 0; i < n; i++) {
             
                if (matriz[atual][i] == 1 && !visitado[i]) {
                    tras++;
                    fila[tras] = i;  
                    visitado[i] = true; 
                }
            }
        }

        sc.close();
    }
}
