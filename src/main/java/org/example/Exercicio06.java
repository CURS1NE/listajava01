package org.example;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o valor do raio");
    double raio = sc.nextDouble();

    Double area = 3.14 * (raio * raio);

    Double perimetro = 2 * 3.14 * raio;

    System.out.println("A área do circulo é " + area + " e o perímetro do circulo é " + perimetro);

    }

}
