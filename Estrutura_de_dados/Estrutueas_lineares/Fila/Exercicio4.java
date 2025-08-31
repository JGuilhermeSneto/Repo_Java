package Estrutura_de_dados.Estrutueas_lineares.Fila;

public class Exercicio4 {
    static int[] fila = new int[10];
    static int frente = 0;
    static int tras = 0;

    public static int FrenteFila(){
        if(frente <= tras){
            return fila[frente];
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        fila[1] = 10;
        fila[2] = 20;
        tras = 2;

        int elementoDaFrente = FrenteFila();

        System.out.println("Elemento da frente é " + elementoDaFrente);
    }
    

}
