public class Conta {
    private String titular;
    private double saldo;

    // Construtor correto
    public Conta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor >= 0) {
            saldo += valor;
        } else {
            System.out.println("Valor inválido para depósito");
        }
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + titular + " | Saldo da conta: " + saldo);
    }

    public static void main(String[] args) {
        Conta c = new Conta("João", 0);
        c.depositar(800);
        c.sacar(200);
        c.exibirSaldo();
    }
}
