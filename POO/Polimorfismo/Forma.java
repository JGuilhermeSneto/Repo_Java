package POO.Polimorfismo;

import java.util.ArrayList;
import java.util.List;


public class Forma {
    public void desenhar(){
        System.out.println("Desenhando forma genérica");
    }


    static class Circulo extends Forma{
        public void desenhar(){
            System.out.println("Desenhando um círculo");
        }
    }

    static class Quadrado extends Forma{
        public void desenhar(){
            System.out.println("Desenhando um quadrado");
        }
    }

    public static void main(String[] args) {
        List<Forma> formas = new ArrayList<>();
        formas.add(new Quadrado());
        formas.add(new Circulo());



        for(Forma forma: formas){
            forma.desenhar();
        }
    }


}
