public class TestaBiblioteca {

        public static void main(String[] args) {
            livro livro = new livro("A volta dos que nao foram", 1969);
            Revista revista = new Revista("NewtonIano", 2024);
            emprestimo emprestimo01 = new emprestimo(livro, 22, 0.75);
            emprestimo emprestimo02 = new emprestimo(revista, 1, 2.00);

            double multa01 = emprestimo01.calcularMulta();
            double multa02 = emprestimo02.calcularMulta();

            System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.printf("O valor de multa do livro %s é de R$ %.2f%n", livro.getTitulo(), multa01);
            System.out.printf("O valor de multa da Revista %s é de R$ %.2f%n", revista.getTitulo(), multa02);
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }

}
