import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int[] vetor = {2,3,2,4,2,5,2,7};
        int chave;
        int cont;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        chave = sc.nextInt();

        cont = 0;
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == chave){
                cont++;
            }
        }
        System.out.println("O número aparece " + cont + " vezes");
    }
}
