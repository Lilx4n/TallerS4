package ejer4.interfaz;

import ejer4.Frecuenciass.FrecuenciasCardiacas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese apellido: ");
        String apellido = sc.nextLine();

        System.out.print("Ingrese día: ");
        int dia = sc.nextInt();

        System.out.print("Ingrese mes: ");
        int mes = sc.nextInt();

        System.out.print("Ingrese año: ");
        int anio = sc.nextInt();

        FrecuenciasCardiacas persona =
                new FrecuenciasCardiacas(nombre, apellido, dia, mes, anio);

        System.out.println("\n--- RESULTADOS ---");

        persona.mostrarDatos();

        System.out.println("Edad: " + persona.calcularEdad());
        System.out.println("Frecuencia máxima: " + persona.frecuenciaMaxima());
        System.out.println("Rango esperado: " + persona.rangoFrecuencia());
    }
}