package com.exercicios.arrays.exercicios;

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qntdConsoantes = 0;

        for(int i = 0; i<consoantes.length; i++){
            System.out.println("Letra: ");
            String letra = scan.next();
            if(
                    !(letra.equalsIgnoreCase("a")||
                    letra.equalsIgnoreCase("e")||
                    letra.equalsIgnoreCase("i")||
                    letra.equalsIgnoreCase("o")||
                    letra.equalsIgnoreCase("u")
                    )){
                        consoantes[i] = letra;
                        qntdConsoantes++;
            }
        }
        for(String consoante : consoantes){
            if(consoante != null)
                System.out.println(consoante);
        }
        System.out.println("Quantidade de consoantes: " +qntdConsoantes);

    }
}
