package Estrutura_de_dados.Estrutueas_lineares.Arrays;

public class Exercicio2 {
    public static void main(String[] args) {
        int [] valores = {15,9,43,67,8,8};

        int maior = valores[0];   

        for(int i = 1; i <6 ; i++){
            if(valores[i] > maior){
                maior = valores[i];
            }
        }

        System.out.println("O maior valor é = " + maior);
    }



}
