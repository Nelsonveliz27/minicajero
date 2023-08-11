package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Bienvenido al Cajero Automatico\n");
        System.out.println("Ingresa tu clave de 4 digitos");
        Scanner leer = new Scanner(System.in);
        String clave = leer.next();
        if (clave.equals("2908"));{
            double saldo = 2000;
            String opcion = "0";

            while (!opcion.equals("4")){
                System.out.println("\n\nCajero BBVA");
                System.out.println("1.CONSULTAR SALDO");
                System.out.println("2.REALIZAR UN DEPOSITO");
                System.out.println("3.RETIRAR EFECTIVO");
                System.out.println("4.SALIR");
                opcion = leer.next();
                switch (opcion){
                    case "1": {
                        System.out.println("el saldo es : " + saldo);
                        break;
                    }
                    case "2": {
                        System.out.println("Ingrese el valor a depositar");
                        double deposito = leer.nextDouble();
                        if (deposito>0) {
                        saldo = saldo +deposito;
                            System.out.println("Deposito Exitoso\n");
                            System.out.println("Su saldo actual es :" + (saldo));
                        }
                        else {
                            System.out.println("Ingresa un valor mayor a 0.00");
                        }
                        break;
                    }
                    case  "3": {
                        System.out.println("Ingresemonto a retirar");
                        double retiro = leer.nextDouble();
                        if (retiro<saldo){
                            saldo = saldo - retiro;
                            System.out.println("retiro exitoso\n");
                            System.out.println("su saldo actual es :" + (saldo));
                        }else{
                            System.out.println("Excede monto maximo");
                        }
                        break;
                    }
                    case "4": {
                        System.out.println("Gracias por utilizar nuestros cajeros");
                        break;
                    }
                    default: {
                        System.out.println("Opcion Invalida");
                        break;
                    }
                }
            }
        }
    }
}