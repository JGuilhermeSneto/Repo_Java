package POO.exercicios;

public class FuncionariosPOO {
    private String nome;
    private double salario;

    public FuncionariosPOO(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    
    public double calcularBonus() {
        return 0.0; // padrão
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    
    static class Gerente extends FuncionariosPOO {
        public Gerente(String nome, double salario) {
            super(nome, salario);
        }

        
        public double calcularBonus() {
            return getSalario() * 0.20; 
        }
    }

    
    public static void main(String[] args) {
        Gerente g = new Gerente("Ana", 5000);
        System.out.println("Nome: " + g.getNome());
        System.out.println("Salário: " + g.getSalario());
        System.out.println("Bônus: " + g.calcularBonus());
    }
}
