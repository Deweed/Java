public class TestaVeiculo {
    public static void main(String[] args) {
        Carro carro = new Carro("Xiaomi", "Poco X34", 2024, 2);
        Moto moto = new Moto("Puma", "R3", 1956, true);

        System.out.println("\nDetalhes do Carro: \n" +
                carro +
                "-----------------------");

        System.out.println("\nDetalhes da Moto: \n" +
                moto +
                "-----------------------");


        carro.setAno(2025);
        moto.setEletrica(false);

        System.out.println("\nDetalhes do Carro pos atualizacao: \n" +
                carro +
                "-----------------------");

        System.out.println("\nDetalhes da Moto pos atualizacao: \n" +
                moto +
                "-----------------------");


    }
}
