package com.cieep.separacion;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    /**
     * Leer una frase y retornar por salida estandar las palabras separadas
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String frase = scanner.nextLine();

        StringTokenizer stringTokenizer = new StringTokenizer(frase);

        while (stringTokenizer.hasMoreElements()) {
            String palabra = stringTokenizer.nextToken();
            System.out.println(palabra);
        }

        System.out.println("FIN");
    }
}