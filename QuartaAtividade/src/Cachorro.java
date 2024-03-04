public class Cachorro {
    String raca;
    int tamanho;
    String cor;
    boolean tem_rabo;

    void late() {
        if (tem_rabo == true) {
            System.out.println("\nEu sou o " + raca +
                    ", tenho " + tamanho + "cm" +
                    ", minha cor é " + cor +
                    " e eu tenho rabo :)");
        } else {
            System.out.println("\nEu sou o " + raca +
                    ", tenho " + tamanho + "cm" +
                    ", minha cor é " + cor +
                    " e eu não tenho rabo :(");
        }
    }


}
