package POO.Heranca;

public class Pagamentos { // Classe principal

    // Classe base para todos os pagamentos
    class pagamentos { 
        double valor; 
        String data;  

        // Construtor da classe pagamentos
        public pagamentos(double valor, String data) {
            this.valor = valor; 
            this.data = data;   
        }

        // Método genérico para processar pagamento
        public void processarPagamento() {
            System.out.println("Processando pagamento");
        }
    }

    // Classe de pagamento por cartão
    class pagamentoCartao extends pagamentos { 
        String codigoBarra; 

        // Construtor pagamentoCartão
        public pagamentoCartao(double valor, String data, String codigoBarra) {
            super(valor, data); // Chama o construtor da superclasse para inicializar valor e data
            this.codigoBarra = codigoBarra;
        }

        // método processarPagamento
        
        public void processarPagamento() {
            System.out.println("Gerando pagamento no cartão com código de barras: " + this.codigoBarra);
            System.out.println("Valor: " + this.valor); //herda valor de pagamentos
        }
    }

    // Classe de pagamento por boleto
    class pagamentoBoleto extends pagamentos { // 
        String codigoBarra; 

        // Construtor
        public pagamentoBoleto(double valor, String data, String codigoBarra) {
            super(valor, data); // Inicializa os atributos da classe pai
            this.codigoBarra = codigoBarra; 
        }

        // Sobrescreve método para boleto
        public void processarPagamento() {
            System.out.println("Gerando boleto com código de barras: " + this.codigoBarra);
            System.out.println("Valor: " + this.valor);
        }
    }

  
    public static void main(String[] args) {
        Pagamentos sistema = new Pagamentos(); 
        // ✅ Criando instâncias das classes internas usando sistema.new
        pagamentoCartao pgCartao = sistema.new pagamentoCartao(150.0, "1/01/2005", "767667667");
        pagamentoBoleto pgBoleto = sistema.new pagamentoBoleto(75.80, "1/01/2005", "870989083908209");

        // ✅ Chamando métodos
        pgCartao.processarPagamento();
        System.out.println("=======================================");
        pgBoleto.processarPagamento();
    }
}
