import java.text.NumberFormat;

public class FormataNumerosInt {
    public static void main(String[] args) {

        double vetor[] = {12.6, 456.9, 65.4};
        NumberFormat nf = NumberFormat.getIntegerInstance();

        for (int a = 0; a < vetor.length; a++){
            if (a != 0) {
                System.out.println(" - ");
            }
            System.out.println(nf.format(vetor[a]));
        }
    }
}
