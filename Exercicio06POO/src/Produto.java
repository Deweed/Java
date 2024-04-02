public class Produto {
    String name;
    double precoUnitario;
    int quantidadeEmEstoque;

    public Produto (String name, double precoUnitario, int quantidadeEmEstoque) {
        this.name = name;
        this.precoUnitario = precoUnitario;
        this.quantidadeEmEstoque = quantidadeEmEstoque;

    }

    public java.lang.String getName() {
        return name;
    }

    public void setNome(java.lang.String name) {
        this.name = name;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public int adicionarEstoque (int quantidade) {
        quantidadeEmEstoque += quantidade;
        System.out.println(quantidade + " unidades adicionadas ao estoque de " + name);
        return quantidadeEmEstoque;
    }

    public int removerEstoque (int quantidade) {
        if (quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
            System.out.println(quantidade + " unidades removidas do estoque de " + name);
        } else {
            System.out.println("Estoque insuficiente para remover " + quantidade + " unidades de " + name);
        }
        return quantidadeEmEstoque;
    }

    public static void imprimirDetalhesProduto(Produto produto) {
        System.out.println("\nNome: " + produto.getName() +
                "\nPreço Unitário: R$" + produto.getPrecoUnitario() +
                "\nQuantidade em Estoque: " + produto.getQuantidadeEmEstoque() +
                "\n--------------------------------------");
    }
}
