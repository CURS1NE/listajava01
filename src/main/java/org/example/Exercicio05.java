package org.example;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor da hora trabalhada");
        Double valorHora = sc.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhadas no mês");
        Double qtdeHoras = sc.nextDouble();
        Double salarioBruto = valorHora * qtdeHoras;
        Double descontoINSS = salarioBruto * 8/100;
        Double salarioLiquido = salarioBruto - descontoINSS;
        System.out.println("==================================================");
        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Desconto do INSS: " + descontoINSS);
        System.out.println("Salário Liquido: " + salarioLiquido);
        System.out.println("==================================================");






    }
}



