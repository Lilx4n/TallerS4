package ejer1.negocio;

public class Factura {
    private String numPieza;
    private String descPieza;
    private int cant;
    private double precioArt;



    public Factura(String numPieza, String descPieza, int cant, double precioArt){
        this.numPieza = numPieza;
        this.descPieza = descPieza;
        setCant(cant);
        setPrecioArt(precioArt);
    }

    public String getNumPieza() {
        return numPieza;
    }
    public void setNumPieza(String numPieza) {
        this.numPieza = numPieza;
    }

    public String getDescPieza() {
        return descPieza;
    }
    public void setDescPieza(String descPieza) {
        this.descPieza = descPieza;
    }

    public int getCantidad() {
        return cant;
    }
    public void setCant(int cant) {
        if (cant>0) {
            this.cant = cant;
        } else {
            this.cant = 0;
        }
    }

    public double getPrecioArt() {
        return precioArt;
    }

    public void setPrecioArt(double precioArt) {
        if (precioArt>0.0) {
            this.precioArt = precioArt;
        } else {
            this.precioArt = 0.0;
        }
    }

    public double totalFactura(){
        return cant*precioArt;
    }
}
