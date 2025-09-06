import java.util.Scanner;

public class grafo2 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        int v1,v2;
        String[] lista = new String[20];

        System.out.println("Digite a quantidade de vértices: ");
        n = sc.nextInt();
        System.out.println("Digite a quantidade de arestas: ");
        m = sc.nextInt();

        for(int i = 0; i < n; i++){
            lista[i] = "";
        }

        for(int i = 0; i < m; i++){
            System.out.println("Digite a aresta(v1 v2): ");
            v1 = sc.nextInt() - 1;
            v2 = sc.nextInt() - 1;

            if(lista[v1].isEmpty()){
                lista[v1] = String.valueOf(v2 + 1);
            }else{
                lista[v1] = lista[v1] + " " + (v2 + 1);
            }

            if (lista[v2].isEmpty()) {
                lista[v2] = String.valueOf(v1 + 1);
            }else{
                lista[v2] = lista[v2] + " " + (v1 + 1);
            }

        }

        System.out.println("Lista de adjacência: ");
        for(int i = 0; i < n; i++){
            System.out.println((i + 1) + " -> "+ lista[i]) ;
        }

        sc.close();
    }
}
