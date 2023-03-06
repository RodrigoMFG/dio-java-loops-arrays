package com.exercicios.loops.exercicios;

import java.util.Scanner;

public class Ex4_ParOuImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantidadeNumeros;
        int numero;
        int quantidadePares = 0;
        int quantidadeImpares = 0;

        System.out.println("Quantidade de numeros: ");
        quantidadeNumeros = scan.nextInt();

        int count = 0;
        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if(numero %2 == 0) quantidadePares++;
            else quantidadeImpares++;
            count++;
        }while(count<quantidadeNumeros);

        System.out.println("Quantidade de Pares: " +quantidadePares);
        System.out.println("Quantidade de Impares: " +quantidadeImpares);

    }
}
