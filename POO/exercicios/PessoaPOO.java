package POO.exercicios;

public class PessoaPOO {
    private String nome;
    private int idade;

    public PessoaPOO(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }


    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }


    public static void main(String[] args) {
        PessoaPOO pessoa = new PessoaPOO("Alessandra", 20);
        System.out.println("Mostrar nome:" + pessoa.getNome());
        pessoa.setIdade(20);
        System.out.println("Mostrar idade:" + pessoa.getIdade());
    }
}
