package ejer5.interfaz;

import ejer5.negocio.PerfilMedico;
import java.util.Scanner;

public class PruebaPerfilMedico {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese apellido: ");
        String apellido = sc.nextLine();

        System.out.print("Ingrese sexo (M/F): ");
        String sexo = sc.nextLine();

        System.out.print("Ingrese dia de nacimiento: ");
        int dia = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese mes de nacimiento: ");
        int mes = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese año de nacimiento: ");
        int anio = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese altura en cm: ");
        double altura = Double.parseDouble(sc.nextLine());

        System.out.print("Ingrese peso en kg: ");
        double peso = Double.parseDouble(sc.nextLine());

        PerfilMedico paciente = new PerfilMedico(nombre, apellido, sexo, dia, mes, anio, altura, peso);

        System.out.println("\n--- RESULTADOS ---");

        paciente.mostrarDatos();

        System.out.println("Edad: " + paciente.calcularEdad());
        System.out.println("Frecuencia máxima: " + paciente.frecuenciaMaxima());
        System.out.println("Rango esperado: " + paciente.rangoFrecuencia());

        System.out.printf("BMI (Índice de Masa Corporal): \n", paciente.calcularBMI());

        System.out.println("\n--- VALORES DE BMI ---");
        System.out.println("Bajo peso: menos de 18.5");
        System.out.println("Normal: entre 18.5 y 24.9");
        System.out.println("Sobrepeso: entre 25 y 29.9");
        System.out.println("Obeso: 30 o más");
    }
}