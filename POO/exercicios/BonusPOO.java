package POO.exercicios;

import java.util.ArrayList;
import java.util.List;

public class BonusPOO {
    private String nome;
    private double salario;

    public BonusPOO(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public double getSalario(){
        return this.salario;
    }

    public String getNome(){
        return this.nome;
    }

    public double calcBonus(){
        return salario * 0.1;
    }

    static class Gerente extends BonusPOO {
        public Gerente(String nome, double salario){
            super(nome, salario);
        }

        public double calcBonus(){
            return getSalario() * 0.2;
        }
        
    }


    static class Vendedor extends BonusPOO {
        private int vendas;
        public Vendedor(String nome, double salario, int vendas) {
            super(nome,salario);
            this.vendas = vendas;
        }

        public double calcBonus(){
            return getSalario() * 0.1 + vendas * 0.5;
        }
    }

    public static void main(String[] args) {
        List<BonusPOO> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("Zeka", 1700.00));
        funcionarios.add(new Vendedor("Pedro", 1770.00, 4));

        for (BonusPOO bonus : funcionarios) {
            System.out.println("Imprimindo bônus:" + bonus.getNome());
            System.out.println("Sálario:" + bonus.getSalario());
            System.out.println("Bônus:" + bonus.calcBonus());
        }
        
    }



}

