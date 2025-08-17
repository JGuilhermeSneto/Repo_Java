package POO.exercicios;

import java.util.ArrayList;
import java.util.List;

public class AnimaisPOO {
    private String nome;

    public AnimaisPOO(String nome) {
        this.nome = nome;
    }


    public String getNome(){
        return this.nome;
    }

    static class Cachorro extends AnimaisPOO {

        public Cachorro(String nome) {
            super(nome);
        }

        public void falar(){
            System.out.println(getNome()+ "Late auauauauauauauua");
        }
        
    }

    static class Gato extends AnimaisPOO {
        public Gato(String nome){
            super(nome);
        }

        public void falar(){
            System.out.println(getNome()+ "gato miaaaaaaaaaaaaaaauuuuuuuuuuuuuu");
        }
        
    }

    public static void main(String[] args) {
        List<AnimaisPOO> animais = new ArrayList<>();

        animais.add(new Cachorro("LUK"));
        animais.add(new Gato("MIAU"));


        for(AnimaisPOO a : animais){
            if(a instanceof Cachorro){
                ((Cachorro) a).falar();
            }else if (a instanceof Gato) {
                ((Gato) a).falar();
            }
        }
    }
}
