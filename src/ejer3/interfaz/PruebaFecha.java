package ejer3.interfaz;


import java.util.Scanner;
import ejer3.fecha.Fecha;

public class PruebaFecha {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el mes: ");
        int mes = sc.nextInt();

        System.out.print("Ingrese el día: ");
        int dia = sc.nextInt();

        System.out.print("Ingrese el año: ");
        int anio = sc.nextInt();

        Fecha f = new Fecha(mes, dia, anio);

        System.out.print("Fecha: ");
        f.mostrarFecha();
    }
}