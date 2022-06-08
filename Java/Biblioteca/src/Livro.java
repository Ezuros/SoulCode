public abstract class Livro implements LivroInterface{ //Abstract - não é a classe livro que é obrigada a implementar os métodos

    private String nome;
    private int quantidade;

    public Livro(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public Livro(String nome) {  //construtor para utilizar na classe Ebook, já que não precisa da quantidade
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
