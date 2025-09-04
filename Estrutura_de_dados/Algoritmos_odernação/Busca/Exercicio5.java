import java.util.Scanner;

public class Exercicio5 {
   public static void main(String[] args) {
    int[] vetor = {1,2,3,2,4,2,5};
    int chave;

    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o número para buscar: ");
    chave = sc.nextInt();

    for(int i = 0; i < vetor.length; i++){
        if(vetor[i] == chave){
            System.out.println("Encontrado na posição: " + i);
        }
    }
    sc.close();
   } 
}
