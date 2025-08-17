package POO.exercicios;

import java.util.ArrayList;
import java.util.List;

public class ALUNOSPOO {
    private String nome;

    public ALUNOSPOO(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void falar(){
        System.out.println(getNome() +"Está falando");
    }

    static class Professor extends ALUNOSPOO{
        public Professor(String nome){
            super(nome);
        }

        public void falar(){
            System.out.println(getNome() + "Está ensinando");
        }
    }

    static class Aluno extends ALUNOSPOO {

        public Aluno(String nome){
            super(nome);
        }
        
        public void falar(){
            System.out.println(getNome() + "está falando");
        }

    }


    public static void main(String[] args) {
        List<ALUNOSPOO> pessoas = new ArrayList<>();

        pessoas.add(new Professor("Zeka"));
        pessoas.add(new Aluno("Pedro"));

        for(ALUNOSPOO gente : pessoas){
            if (gente instanceof Professor) {
                ((Professor) gente).falar();
            }else if(gente instanceof Aluno){
                ((Aluno) gente).falar();
            }
        }
    }
}
