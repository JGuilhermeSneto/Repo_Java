package Exercicios;
public class BubleShort {
    public static void main(String[] args) {
        int[] vetor = {2,8,5,3,9};

        for(int i = 0; i < vetor.length - 1; i++){
            for(int j = 0; j < vetor.length - 1 - i; i++){
                if(vetor[j] > vetor[j + i]){
                    int temp = vetor[j];
                    vetor[j] = vetor [j + i];
                    vetor [j + i] =  temp;
                }
            }
        }
        System.out.println("Vetor ordenado:");
        for(int num : vetor){
            System.out.println(num + "");
        }


    }
    
}