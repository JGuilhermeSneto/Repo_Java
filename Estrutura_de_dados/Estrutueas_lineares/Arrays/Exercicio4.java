package Estrutura_de_dados.Estrutueas_lineares.Arrays;

public class Exercicio4 {
    public static void main(String[] args) {
        int[] numeros = {3,4,6,87,89,43,1};
        int cont = 0;

        for(int i = 0 ; i < 7; i++){
            if(numeros[i] % 2==0){
                cont++;
            }
        }
        System.out.println("Quantiadade de números: " + cont);
    }
}
