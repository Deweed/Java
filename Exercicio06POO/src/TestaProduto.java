public class TestaProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto("Cachorro quente de brinquedo", 118.99, 34);
        Produto p2 = new Produto("Garrafa de veludo para jogar no colega", 09.83, 54);

        System.out.println("--------------------------------------");
        System.out.println("\nDetalhes do Produto 1:");
        Produto.imprimirDetalhesProduto(p1);
        System.out.println("\nDetalhes do Produto 2:");
        Produto.imprimirDetalhesProduto(p2);
        System.out.println("--------------------------------------");


        p1.adicionarEstoque(5);
        p2.removerEstoque(2);

        System.out.println("--------------------------------------");
        System.out.println("\nDetalhes do Produto 1 após adição de estoque:");
        Produto.imprimirDetalhesProduto(p1);
        System.out.println("\nDetalhes do Produto 2 após remoção de estoque:");
        Produto.imprimirDetalhesProduto(p2);
        System.out.println("--------------------------------------");
    }

}
