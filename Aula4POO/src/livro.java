
public class livro extends material {
        public livro(String livro, int anoPublicacao) {
            super(livro, anoPublicacao);
        }
        public String toString() {
            return "Livro" + getTitulo() + "Ano de Publicacao=" + getAnoPublicacao() + super.toString();
        }


}
