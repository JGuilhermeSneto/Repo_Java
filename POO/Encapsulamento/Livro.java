public class Livro {
    private String titulo;
    private String autor;


    public Livro(String titulo, String autor) {
        setTitulo(titulo);
        this.autor = autor;
    }




    public void setTitulo(String titulo){
        if (!titulo.isEmpty()) {
            this.titulo = titulo;
        }
    }


    public void exibir(){
        System.out.println("Título:" + titulo + "| Autor: "+ autor + "\n");

    }






    public static void main(String[] args) {
        Livro l = new Livro("O Hobbit", "Tolkien");
        l.setTitulo("");
        l.exibir();

    }
}

