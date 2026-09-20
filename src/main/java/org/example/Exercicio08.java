package org.example;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a temperatura em C°: ");
        Double temperaturaGraus = input.nextDouble();

        Double temperaturaFarenheit = (temperaturaGraus * 9/5) + 32 ;
        Double temperaturaKelvin = temperaturaGraus + 273.15;

        System.out.println("Temperatura em Graus Celsius: " + temperaturaGraus + "C°");
        System.out.println("Temperatura em Farenheit: " + temperaturaFarenheit + "°F");
        System.out.println("Temperatura em Kelvin: " + temperaturaKelvin + "K") ;

    }



}


