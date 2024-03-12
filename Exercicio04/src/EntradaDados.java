import java.util.Scanner;
import java.io.*;

public class EntradaDados {
    public static void main(String[] args) {
        // Leitura utilizando o Scanner
        Scanner entrada = new Scanner(System.in);

        // variaveis
        String nome;
        int idade;

        System.out.print("\nDigite um nome: ");
        nome = entrada.nextLine();

        System.out.print("Digite uma idade: ");
        idade = entrada.nextInt();

        System.out.printf("\nNome informado foi %s com idade de %d.\n", nome, idade);
    }
}
