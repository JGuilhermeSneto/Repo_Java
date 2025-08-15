package POO.Polimorfismo;

public class Impressora {
    String imprimir;
    int copias;
    public void Imprimir(String imprimir){
        System.out.println("Imprimindo texto" + imprimir);
    }


    public void Imprimir(int copias){
        System.out.println("Imprimindo número de"+ copias);
    }
    
    public void Imprimir(String imprimir, int copias){
        System.out.println("Imprimindo" + copias + "Cópias de:" + imprimir);
    }


    public static void main(String[] args) {
        Impressora impressora;
        String texto;
        int numero;
        int copias;

        impressora = new Impressora();
        texto = "Relatório";
        numero = 13;
        copias = 5;

        impressora.Imprimir(texto);
        impressora.Imprimir(numero);
        impressora.Imprimir(texto , copias);


    }


}
