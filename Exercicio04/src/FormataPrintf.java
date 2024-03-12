public class FormataPrintf {
    public static void main(String[] args) {
        String minha_string = "Programação Orientada a Objetos";
        int meu_inteiro = 2564;
        float meu_numero = 875.34f;

        //System.out.print(minha_string + " - " + meu_inteiro + " - " + meu_numero);
        System.out.printf("%s - %d - %.2f", minha_string, meu_inteiro, meu_numero);
    }
}
