package POO.Exercicios_2;


public class Aluno {
    private String nome;
    private double[] notas = new double[100];
    private int qtdNotas;

    public Aluno(String nome, int qtdNotas){
        this.nome = nome;
        this.qtdNotas = 0;
    }

    public void adicionarNota(double nota){
        if (qtdNotas < notas.length) {
            notas[qtdNotas] = nota;
            qtdNotas++;
        } else {
            System.out.println("Limite de notas atingido!");
        }
    }


    public double calcularMedia(){
        if (qtdNotas == 0) {
            return 0;
        }

        double soma = 0;
        for(int i = 0 ; i < qtdNotas; i++){
            soma = soma +notas[i];
        }
        return soma / qtdNotas;
    }

    public void listarNotas(){
        System.out.println("Notas de:" + nome);
        for(int i = 0; i < qtdNotas; i++){
            System.out.println("- " + notas[i]);
        }
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Zeka", 3);
        Aluno aluno2 = new Aluno("Alessandra", 5);
        Aluno aluno3 = new Aluno("Australopitecos", 2);


        aluno1.adicionarNota(9.7);
        aluno2.adicionarNota(10);
        aluno3.adicionarNota(7.9);

        aluno1.listarNotas();
        aluno2.listarNotas();
        aluno3.listarNotas();
        System.out.println("Média do aluno 1"+ aluno1.calcularMedia());
        System.out.println("Média do aluno 2" + aluno2.calcularMedia());
        System.out.println("Média do aluno 3" + aluno3.calcularMedia());
    }

}
