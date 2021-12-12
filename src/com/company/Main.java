package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Q2. Escreva um programa que lê uma palavra e a escreve de volta ao contrário.

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scan.nextLine();
        String palavraContrario = "";

        for(int i=palavra.length() -1; i>=0; i--){
            palavraContrario = palavraContrario+palavra.charAt(i);
        };
        System.out.println("A palavra " + palavra + "ao contrário é: " + palavraContrario);


    }
}
