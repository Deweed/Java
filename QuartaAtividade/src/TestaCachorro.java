public class TestaCachorro {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();
        Cachorro c2 = new Cachorro();

        c1.raca = "Golden";
        c1.tamanho = 120;
        c1.cor = "Dourado";
        c1.tem_rabo = true;

        c2.raca = "Vira Lata";
        c2.tamanho = 90;
        c2.cor = "Caramelo";
        c2.tem_rabo = false;

        c1.late();
        c2.late();
    }
}



