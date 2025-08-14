package POO.Heranca;

public class Pessoa {
    String nome;

    public void Apresentar(){
        System.out.println("Olá meu nome é" + nome);
    }

    static class Aluno extends Pessoa{
        String matricula;

        public Aluno(String nome, String matricula) {
            this.nome = nome;
            this.matricula = matricula;
        }

        public void Apresentar(){
            System.out.println("Olá meu nome é:" + nome + "e minha matricula é:" +matricula);
        }
    }






    static class Professor extends Pessoa {
        String disciplina;


        public Professor(String nome, String disciplina) {
            this.nome = nome;
            this.disciplina = disciplina;
        }


        public void Apresentar(){
            System.out.println("Olá meu nome é:" + nome + "e sou professor da disciplina"+ disciplina);
        }
        
    }

    public static void main(String[] args) {
        Professor prof = new Professor("ZEKA", "POO");
        Aluno aluno = new Aluno("Guilherme", "6987654");


        prof.Apresentar();
        aluno.Apresentar();
    }


}
