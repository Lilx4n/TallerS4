package ejer4.Frecuenciass;

public class FrecuenciasCardiacas {

    private String nombre;
    private String apellido;
    private int dia;
    private int mes;
    private int anio;


    public FrecuenciasCardiacas(String nombre, String apellido, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public int getDia() { return dia; }
    public void setDia(int dia) { this.dia = dia; }

    public int getMes() { return mes; }
    public void setMes(int mes) { this.mes = mes; }

    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }

    public int calcularEdad() {
        return 2026 - anio;
    }

    public int frecuenciaMaxima() {
        return 220 - calcularEdad();
    }

    public String rangoFrecuencia() {
        int max = frecuenciaMaxima();
        double min = max * 0.5;
        double maximo = max * 0.85;
        return min + " - " + maximo;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Fecha nacimiento: " + dia + "/" + mes + "/" + anio);
    }
}