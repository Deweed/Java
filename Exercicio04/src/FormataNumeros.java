import java.text.NumberFormat;

public class FormataNumeros {
    public static void main(String[] args) {
        System.out.println(NumberFormat.getCurrencyInstance().format(123456789.90));

        double vetor[] = {532.34, 659.98, 2.89, 1058.65};
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        for (int a = 0; a < vetor.length; a++) {
            if (a != 0) {
                System.out.println(" - ");
            }
            System.out.println(nf.format(vetor[a]));
        }
    }
}
