package ejer1.interfaz;

import ejer1.negocio.Factura;

import java.util.Scanner;

public class PruebaFactura {
    public static void main(String[] args) {
        String numPieza, descPieza;
        int cant;
        double precioArt;
        Factura fact1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero de la pieza: ");
        numPieza = sc.nextLine();
        System.out.println("Ingrese la descripcion de la pieza: ");
        descPieza = sc.nextLine();
        System.out.println("Ingrese la cantidad: ");
        cant = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el precio: ");
        precioArt = Double.parseDouble(sc.nextLine());

        fact1 = new Factura(numPieza,descPieza,cant,precioArt);

        System.out.println("\n---Datos de la factura---");
        System.out.println("# de pieza: "+fact1.getNumPieza());
        System.out.println("Descripcion de pieza: "+fact1.getDescPieza());
        System.out.println("Cantidad: "+fact1.getCantidad());
        System.out.println("Precio: "+fact1.getPrecioArt());
        System.out.println("Total a pagar: "+fact1.totalFactura());

    }
}
