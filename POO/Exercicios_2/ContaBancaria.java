package POO.Exercicios_2;

import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private List<Double> transacoes;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
        this.transacoes = new ArrayList<>();
    }


    public void depositar(Double valor){
        if (valor > 0) {
            saldo += valor;
            transacoes.add(valor);
        }
    }
    
    public void sacar(double valor){
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            transacoes.add(-valor);
        }else{
            System.out.println("Saque inválido");
        }
    }

    public double sacar(){
        return saldo;
    }

    public double calcularSaldo(){
        return saldo;
    }

    public void ListarTransacoes(){
        System.out.println("Transacoes de" + titular + ":\n");
        for(Double t : transacoes){
            System.out.println(t);
        }
 
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(null, 0);
        conta = new ContaBancaria("João", 1000.00);

        conta.depositar(500.90);
        conta.sacar(550.50);

        System.out.println("Saldo atual:" + conta.calcularSaldo()+ "\n");
        conta.ListarTransacoes();
    }

}
