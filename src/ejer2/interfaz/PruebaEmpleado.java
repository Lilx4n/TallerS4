package ejer2.interfaz;

import ejer2.negocio.Empleado;

import java.util.Scanner;

public class PruebaEmpleado {
    public static void main(String[] args) {
        String nombre, apellido;
        double salario;
        Scanner sc = new Scanner(System.in);
        Empleado em1;
        Empleado em2;

        //leer variables
        System.out.println("Ingrese el nombre del empleado 1: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese el apellido del empleado 1: ");
        apellido = sc.nextLine();
        System.out.println("Ingrese el salario del emepleado 1: ");
        salario = Double.parseDouble(sc.nextLine());

        em1 = new Empleado(nombre,apellido,salario);

        System.out.println("Ingrese el nombre del empleado 2: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese el apellido del empleado 2: ");
        apellido = sc.nextLine();
        System.out.println("Ingrese el salario del emepleado 2: ");
        salario = Double.parseDouble(sc.nextLine());

        //copiar la lectura varibles
        em2 = new Empleado(nombre,apellido,salario);
        System.out.println("El salario del empleado em1 es "+em1.getSalario()*12);
        System.out.println("El salario del empleado em2 es "+em2.getSalario()*12);

        double nuevoSal = em1.getSalario()*1.1;
        em1.setSalario(nuevoSal);

        System.out.println("El nuevo salario del empleado 1 es: "+em1.getSalario()*12);

        em2.setSalario(em2.getSalario()*1.1);

        System.out.println("El nuevo salario del empleado 2 es: "+em2.getSalario()*12);
    }
}
