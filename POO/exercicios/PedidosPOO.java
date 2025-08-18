package POO.exercicios;

import java.util.ArrayList;
import java.util.List;

public class PedidosPOO {
    private String nome;
    private double preco;

    public PedidosPOO(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    static class Pedido {
        private List<PedidosPOO> pratos;

        public Pedido() {
            this.pratos = new ArrayList<>();
        }

        public void adicionarPrato(PedidosPOO prato) {
            this.pratos.add(prato);
        }

        public double calcTotal() {
            double total = 0;
            for (PedidosPOO prato : pratos) {
                total += prato.getPreco();
            }
            return total;
        }

        public void listarPratos() {
            for (PedidosPOO prato : pratos) {
                System.out.println("Prato: " + prato.getNome() + " | Preço R$ " + prato.getPreco());
            }
        }
    }

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.adicionarPrato(new PedidosPOO("Pizza", 10));
        pedido.adicionarPrato(new PedidosPOO("Suco", 2));

        pedido.listarPratos();
        System.out.println("Total do Pedido: R$ " + pedido.calcTotal());
    }
}
