package POO.Polimorfismo;

public class ContBanc {
    double valor;

    
    public void sacar(double valor){
        System.out.println("Saque de R$" + valor + " realizado");
    }

    static class ContaCorrente extends ContBanc {
        
        public void sacar(double valor){
            System.out.println("Saque na conta corrente: R$" + valor);
        }
    }

    static class ContaPoupanca extends ContBanc{
        
        public void sacar(double valor){
            System.out.println("Saque na conta poupança: R$" + valor);
        }
    }

    public static void main(String[] args) {
        ContBanc conta1;
        ContBanc conta2;

        double valor1 = 200.00;
        double valor2 = 300.00;
        
        conta1 = new ContaCorrente();
        conta2 = new ContaPoupanca();

        
        conta1.sacar(valor1);
        conta2.sacar(valor2);
    }
}
