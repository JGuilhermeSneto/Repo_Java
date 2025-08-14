package Exercicios_de_Logica;
public class teste {
    public static void main(String[] args) {
        int cont;
        int rest;
        int x = 0;
        int n = 0;


        cont = n;
        rest = 0;
        x = 2;
        n = 4;

        while (cont >= n) {
            rest = rest * 3;
            cont = cont + 1;
        }
        System.out.println(rest);

    }
}
