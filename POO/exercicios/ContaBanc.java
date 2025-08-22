package POO.exercicios;

public class ContaBanc {
    private String numeroConta;
    private double saldo;


    public ContaBanc(String numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void Depositar(double valor){
        if(valor > 0){
            saldo += valor;
        }else{
            System.out.println("Valor inválido");
        }
    }

    public void Sacar(double valor){
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;     
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public double getSaldo(){
        return saldo;
    }


    public static void main(String[] args) {
        ContaBanc contaBancaria = new ContaBanc("12345678", 10000);
        contaBancaria.Depositar(600.00);
        contaBancaria.Sacar(300);
        System.out.println("Mostrar saldo" + contaBancaria.getSaldo());
    }

}
