package com.exercicios.loops.exercicios;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int numero;
        int count = 0;
        int maior = 0;
        double soma = 0;
        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();
            soma = soma + numero;
            if(numero>maior) maior = numero;
            count++;
        }while(count<5);


        System.out.println("Maior: " + maior);
        System.out.println("Media: " + (soma/5));

    }
}
