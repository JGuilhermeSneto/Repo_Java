import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = {2,3,2,5,2,7};
        int chave;
        int cont;

        System.out.println("Digite o número que deseja encontrar: ");
        chave = sc.nextInt();

        cont = 0;
        for(int i = 0; i <vetor.length;i++){
            if(vetor[i] == chave){
                cont++;
            }
        }

        System.out.println("O número aparece " + cont + " vezes");
    }
}
