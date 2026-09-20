package org.example;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        Double dollar = 5.75;

        System.out.println("Informe o valor em reais");
        Double valorReal =  sc.nextDouble();

        Double totalDollar = valorReal / dollar;

        System.out.println("O total é " +  totalDollar);






    }





}
