package org.example;

import java.util.Scanner;



public class Exercicio07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a base: ");
        Double base = input.nextDouble();
        System.out.println("Digite a altura: ");
        Double altura = input.nextDouble();

        Double area = base * altura ;
        Double perimetro = 2 *  (base + altura);
        Double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));

        System.out.println("A área do seu retângulo é " + area + ", o perímetro é " + perimetro + " e a diagonal é " + diagonal);

    }
}
