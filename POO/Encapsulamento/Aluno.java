public class Aluno {
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private String nome;


    public Aluno(String nome, double nota1, double nota2, double nota3, double nota4) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }



    public double calcularMedia(){
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    public boolean aprovado(){
        return calcularMedia() >= 7;
    }


    public static void main(String[] args) {
        Aluno aluno = new Aluno("Pedro", 8.0, 6.6,5.7,7.5);
        System.out.println("Média:" + aluno.calcularMedia()+ "\n");
        System.out.println("Aprovado:" + aluno.aprovado()+ "\n");
    }












}
