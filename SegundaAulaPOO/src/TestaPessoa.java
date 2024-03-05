public class TestaPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.nome = "Jeffin Caminhoes";
        p1.idade = 65;

        p1.pessoa();
        p1.fazerAniversario();
        p1.pessoa();

        Livro l1 = new Livro();

        l1.titulo = "POO";
        l1.autor = "Max";
        p1.LivroFav = l1;

        p1.pessoa();
        System.out.println("Livro Favorito: " + p1.LivroFav.titulo);
    }
}
