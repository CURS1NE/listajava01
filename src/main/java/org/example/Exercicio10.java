package org.example;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a primeira nota do aluno");
        Double nota1 =  sc.nextDouble();

        System.out.println("Informe a segunda nota do aluno");
        Double nota2 =  sc.nextDouble();

        System.out.println("Informe a terceira nota do aluno");
        Double nota3 =  sc.nextDouble();

        System.out.println("Informe a quarta nota do aluno");
        Double nota4 =  sc.nextDouble();

        Double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média final do aluno é " + media);

        if (media >= 7) {
            System.out.println("O aluno foi aprovado!");

        }

        else if (media <= 5 && media < 7) {
            System.out.println("O aluno está de recuperação!");

        }

        else {
            System.out.println("O aluno foi reprovado!");
        }

    }

}
