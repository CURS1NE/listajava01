package org.example;

import java.util.Scanner;


public class Exercicio02 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor informe um numero inteiro: ");
        double numero1 = sc.nextDouble();
        System.out.println("Por favor informe outro numero inteiro: ");
        double numero2 = sc.nextDouble();



        System.out.println("A soma é: " + (numero1 + numero2));
        System.out.println("A subtração é: " + (numero1 - numero2));
        System.out.println("A multiplicação é: " + (numero1 * numero2));
        System.out.println("A divisão é: " + (numero1 / numero2));
    }
}
