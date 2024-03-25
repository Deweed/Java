
public class Revista extends material {

        public Revista(String titulo, int anoPublicacao) {
            super(titulo, anoPublicacao);
        }
        public String toString() {
            return "Revista" + getTitulo() + "Ano de Publicacao=" + getAnoPublicacao() + super.toString();
        }


}
