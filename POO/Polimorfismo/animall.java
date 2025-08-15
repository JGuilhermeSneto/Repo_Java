package POO.Polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class animall {
    public void emitirSom(){
        System.out.println("Som genérico");
    }

    static class Cachorro extends animall{
        public void emitirSom(){
            System.out.println("AUAUAUAUAUAUAU");
        }
    }

    static class Gato extends animall {
        public void emitirSom(){
            System.out.println("MMMMMIIIAAAUUUUUUUU");
        }
        
    }


    static class Quadrupede extends animall{
        public void emitirSom(){
            System.out.println("algum som n indentificavel");
        }
    }



    public static void main(String[] args) {
        List<animall> Listanimais = new ArrayList<>();
        Listanimais.add(new Cachorro());
        Listanimais.add(new Gato());
        Listanimais.add(new Quadrupede());



        for(animall animal : Listanimais){
            animal.emitirSom();
        }

    }

}
