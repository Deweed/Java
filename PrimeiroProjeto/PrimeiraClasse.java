import java.io.IOException;

public class PrimeiraClasse {

    public static void main(string[] args) throws IOException {
        System.out.println("Olá, mundo");
        char ch;
        ch = 'x';
        System.out.println("ch contains "+ ch);
        ch++; //incrementa ch
        System.out.println("ch is now " + ch);
        ch = 98; // dá a ch o valor z
        Systm.out.println("ch is now " + ch);
        byte tipoByte = 127;
        short tipoShort = 32767;
        char tipoChar = 'c';
        float tipoFloat = 2.6f;
        double tipoDouble = 3.59;
        int tipoInt = 2147483647;
        long tipoLong = 9223372036854775807L;
        boolean tipoBooleano = true;
        System.out.println("Valor do tipoByte =" + tipoByte);
        System.out.println("Valor do tipoShort =" + tipoShort);
        System.out.println("Valor do tipoChar =" + tipoChar);
        System.out.println("Valor do tipoFloat =" + tipoFloat);
        System.out.println("Valor do tipoDouble =" + tipoDouble);
        System.out.println("Valor do tipoInt =" + tipoInt);
        System.out.println("Valor do tipoLong =" + tipoLong);
        System.out.println("Valor do tipoBooleano =" + tipoBooleano;

        // Demonstra sequências de escape em strings.
        System.out.println("\nFirst line \nSecond Line");
        System.out.println("A\tB\tC");
        System.out.println("D\tE\tF\n");

        // Demonstra valores booleanos.
        boolean b;
        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);
        // um valor booleano pode controlar a instrução if
        if(b) System.out.println("This is executed.");
        b = false;
        if(b) System.out.println("This is not executed.");
    }
}
