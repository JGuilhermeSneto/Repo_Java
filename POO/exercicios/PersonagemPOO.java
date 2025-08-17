package POO.exercicios;

import java.util.ArrayList;
import java.util.List;

public class PersonagemPOO {
    private String nome;

    public PersonagemPOO(String nome){
        this.nome = nome;
    }

    public void atacar(){
        System.out.println(nome + "ATAAAACAAAAAAARRR");
    }

    public String getNome(){
        return this.nome;
    }


    static class Mago extends PersonagemPOO {
        public Mago(String nome){
            super(nome);
        }
        
        public void atacar(){
            System.out.println(getNome() + "lança magia");
        }
    }


    static class Guerreiro extends PersonagemPOO{
        public Guerreiro(String nome){
            super(nome);
        }


        public void atacar(){
            System.out.println(getNome()+"atacar com espada");
        }
    }



    public static void main(String[] args) {
        List<PersonagemPOO> personagem = new ArrayList<>();

        personagem.add(new Mago("Zekacius"));
        personagem.add(new Guerreiro("Zekarus"));

        for(PersonagemPOO Personagem : personagem){
            Personagem.atacar();
            
        }
    }
}
