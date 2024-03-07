package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    private static void menu() {
        System.out.println("Exemplo de while");
        int opcao = -1;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("\n********** Sistema de Cadastro **********");
            System.out.println("Opção 1: Exercicio 1");
            System.out.println("Opção 2: Exercicio 2");
            System.out.println("Opção 3: Exercicio 3");
            System.out.println("Opção 0: Sair");
            System.out.println("*****************************************");
            System.out.print("Dígite a opção: ");
            opcao = in.nextInt();
            System.out.println("*****************************************");
            switch (opcao) {
                case 1:
                    System.out.println("\nResolvendo o exercicio 1");
                    //cadastrarCliente();
                    exercicio1();
                    break;
                case 2:
                    System.out.println("\nResolvendo o exercicio 2");
                    //cadastrarProduto();
                    exercicio2();
                    break;
                case 3:
                    System.out.println("\nResolvendo o exercicio 3");
                    //cadastrarVendedor();
                    exercicio3();
                    break;
                case 0:
                    System.out.println("\nA Saída foi uma escolha");
                    //sair
                    break;
            }
        } while (opcao != 0);
    }

    private static void exercicio1() {
        //1) Faça um programa que receba quatro números inteiros, calcule e mostre a soma desses número
        Scanner scn = new Scanner(System.in);
        int soma = 0;
        for (int i = 1; i <=4; i++) {
            System.out.print("Digite o " + i + "° número: ");
            soma += scn.nextInt();
        }
        System.out.println("A soma é: " + soma);
    }

    private static void exercicio2() {
        //2) Faça um programa que receba três notas, calcule e mostre a média aritmética entre elas.
        Scanner scn = new Scanner(System.in);
        float calculo = 0.00f;
        float media;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite a " + i + "° nota: ");
            calculo += scn.nextFloat();
        }
        media = calculo / 3.00f;
        System.out.println("A média das três notas é: " + media );
    }

    private static void exercicio3() {
        //3) Faça um programa que receba o salário de um funcionário, calcule e mostre o novo salário
        //sabendo-se que ste sofreu um aumento de 25%
        Scanner scn = new Scanner(System.in);
        float salario = 0.00f;
        float diferenca;
        float newsalario = 0.0f;
        System.out.print("Digite seu salário atual: ");
        salario = scn.nextFloat();
        diferenca = salario * 0.25f;
        newsalario = salario + diferenca;

        String newsalario1 = String.format("%.2f", newsalario);
        String diferenca1 = String.format("%.2f", diferenca);

        System.out.printf("Seu novo salário é igual a: " + newsalario1 +
                "\nSeu salário teve um aumento de: " + diferenca1 + "\n");
    }
}