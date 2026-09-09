package org.example;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, informe seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Por obséquio, informe sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.println("Por gentileza, informe sua altura: ");
        double altura = sc.nextDouble();


        System.out.println("O seu nome é " + nome + ", sua idade é " + idade + " e a sua altura é " + altura);



    }
}
