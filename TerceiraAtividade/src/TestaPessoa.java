public class TestaPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.idade = 23;
        p1.cidade = "Belo Horizonte";
        p1.nome = "Joao Marceneiro";


        p2.idade = 17;
        p2.cidade = "Barbacena";
        p2.nome = "Carlinhos Motorista de táxi";

        p1.apresentar();
        p2.apresentar();
    }
}