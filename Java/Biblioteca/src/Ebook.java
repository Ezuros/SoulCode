public class Ebook extends Livro {

    public Ebook(String nome) {
        super(nome);
    }

    @Override
    public boolean verificarDisponibilidade() {
        return true; //sempre vai estar disponível, ja que é ebook
    }

    @Override
    public void emprestarLivro() {
        System.out.println("O livro " + getNome() + " foi emprestado com sucesso");
    }
}
