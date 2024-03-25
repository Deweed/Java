public class TestaMaterial {

        public static void main(String[] args) {

            livro livro1 = new livro("A volta dos que nao foram", 1969);
            livro livro2 = new livro("As tranças de um careca", 2007);
            Revista revista = new Revista("NewtonIano", 2024);

            System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("-- Livros -- ");
            System.out.println("Título: " + livro1.getTitulo());
            System.out.println("Publicado em: " + livro1.getAnoPublicacao());

            System.out.println("\nTítulo: " + livro2.getTitulo());
            System.out.println("Publicado em: " + livro2.getAnoPublicacao());
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

            System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("-- Revistas -- ");
            System.out.println("Título: " + revista.getTitulo());
            System.out.println("Publicado em: " + revista.getAnoPublicacao());
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }

}
