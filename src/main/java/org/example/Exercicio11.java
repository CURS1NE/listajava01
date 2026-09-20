package org.example;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, numero3;
        int maior, menor;

        System.out.println("Digite o primeiro numero: ");
        numero1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        numero2 = sc.nextInt();

        System.out.println("Digite o terceiro numero: ");
        numero3 = sc.nextInt();

        maior = numero1;
        menor = numero2;

        if (numero2 > maior) {
            maior = numero2;
        }

        if (numero3 > maior) {
            maior = numero3;
        }

        if (numero1 < menor) {
            menor = numero1;

        }

        if (numero3 < menor) {
        }

        System.out.println("O maior número é: " + maior + " e o menor é " + menor);


    }
}
