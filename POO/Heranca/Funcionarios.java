package POO.Heranca;

public class Funcionarios {

    String nome;
    String matricula;


    public Funcionarios(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void trabalhar(){
        System.out.println(this.nome +"Está trabalhando");
    }

    static class Gerente extends Funcionarios{

        String equipe;

        public Gerente(String nome, String matrciula, String equipe){
            super(nome, matrciula);
            this.equipe = equipe;
        } 

        public void trabalhar(){
            System.out.println(this.nome +"está gerenciando a equipe" + equipe);
        }

    }


    static class Desenvolvedor extends Funcionarios{
        String lingagemDeDominio;



        public Desenvolvedor(String nome, String matricula, String lingagem){
            super(nome, matricula);
            this.lingagemDeDominio = lingagem;
        }


        public void trabalhar(){
            System.out.println(this.nome +"está codando em" + this.lingagemDeDominio);
        }
    }

    public static void main(String[] args) {

        Funcionarios funcionarios = new Funcionarios("Pedro", "95");


        Gerente gerente = new Gerente("Zeka", "13", "Biblioteca");
        Desenvolvedor dev = new Desenvolvedor("Pedro", "95", "Java");



        gerente.trabalhar();
        dev.trabalhar();
    }



}
