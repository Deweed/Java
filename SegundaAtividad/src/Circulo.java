public class Circulo {
    int raio;

    double calcula_area() {
        return Math.PI * Math.pow(raio, 2);
    }

    double calcula_perimetro() {
        return 2 * Math.PI * raio;
    }

    public Circulo(int r) {
        raio = r;
    }
}
