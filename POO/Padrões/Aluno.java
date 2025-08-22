package POO.Padrões;


public class Aluno {
    private String nome;
    private double[] notas;

    public Aluno(String nome, double[] notas){
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome(){
        return this.nome;
    }

    public double[] getNotas(){
        return notas;
    }
    
}
