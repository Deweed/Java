public class TestaCirculo {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(3);

        //c1.raio = 3;

        System.out.println("\nÁrea do circulo: " + c1.calcula_area());
        System.out.println("Perimetro do circulo: " + c1.calcula_perimetro());
    }
}