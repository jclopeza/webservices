package com.xebialabs.congruencias.webservices.server;

public class Congruencia {

    //Webservice que realiza los calculos
    public boolean isCongruente(int a, int b, int c) {
        int diferencia = a - c;
        int modulo = diferencia % b;
        if (modulo == 0) {
            System.err.println("El numero es congruente");
            return true;
        } else {
            System.err.println("El numero NO es congruente");
            return false;
        }
    }

    //Webservice que realiza los calculos
    public boolean isPar(int a) {
        int modulo = a % 2;
        if (modulo == 0) {
            System.err.println("El numero es par.");
            return true;
        } else {
            System.err.println("El numero es impar.");
            return false;
        }
    }
}
