package org.example;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double totalConta = 0.0;

        System.out.println("Digite o consumo em kWh: ");
        Double consumo = input.nextDouble();

        if (consumo <= 100.0) {
           totalConta = consumo * 0.5;
        }

        else if (consumo > 100.0 && consumo <= 300.0) {
             totalConta = consumo * 0.75;
        }

        else {
             totalConta = consumo * 1.1;
        }

        System.out.println("Consumo em kWh: " + consumo);
        System.out.println("Valor da conta: R$" + totalConta);
    }
}
