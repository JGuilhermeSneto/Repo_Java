package POO.Heranca;

public class Salario {
    String nome;
    double salario;

    public Salario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void Funcioanrio(String nome, double salario){

    }

    public double calcularSalario(){
        return this.salario;
    }



    static class Professor extends Salario{
        String disciplina;

        public Professor(String nome,double salario, String disciplina){
            super(nome,salario);
            this.disciplina = disciplina;
        }

        public double calcularSalario(){
            return super.calcularSalario() * 1.10;
        }
    }


    static class Coodernador extends Salario{
        String departamento;

        public Coodernador(String nome, double salario, String departamento){
            super(nome, salario);
            this.departamento = departamento;
        }


        public double calcularSalario(){
            return super.calcularSalario() * 1.10;
        }

    }



    public static void main(String[] args) {
        Professor prof = new Professor("Zeka", 2500.50, "POO");
        Coodernador coord = new Coodernador("Zekinha", 45000.10, "Pédagocio");


        System.out.println("O Sálario do professor de POO é:" + prof.calcularSalario());
        System.out.println("O sálario do coodernador é:" + coord.calcularSalario());
    }

}
