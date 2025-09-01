package Estrutura_de_dados.Estrutueas_lineares.Arrays;

public class Exericicio1 {
    public static void main(String[] args) {
        int [] numeros = {10,20,30,40,50};
        int soma = 0;

        for(int i = 0; i < 5; i++){
            soma = soma + numeros[i];
        }
        System.out.println("A soma é = " + soma);
    }
}
