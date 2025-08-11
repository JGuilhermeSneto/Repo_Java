public class ListarLivros {

    private String[] livros = new String[10];
    private int contador = 0;

    // Método para adicionar livros
    public void adicionarLivro(String titulo) {
        if (contador < livros.length) { // primeiro checa o tamanho e se a biblioteca tá cheia
            livros[contador] = titulo;
            contador++;
        } else {
            System.out.println("Biblioteca cheia!");
        }
    }

    // Método para listar livros
    public void listarLivros() {
        if (contador == 0) { // Se estiver vazio irá mostrar o sout abaixo
            System.out.println("Nenhum livro na biblioteca!");
            return;
        }
        for (int i = 0; i < contador; i++) {  // Onde irá incrementar novo livros dentro de um vetor de tamanho 10.
            System.out.println("Livro " + (i + 1) + ": " + livros[i]);
        }
    }

    public static void main(String[] args) {


        // Cria o objeto e instancia ele
        ListarLivros b = new ListarLivros();

        // Chama o método adicioner.
        b.adicionarLivro("O Hobbit");
        b.adicionarLivro("1984");

        // Chama o método para listar os livros
        b.listarLivros();
    }
}
