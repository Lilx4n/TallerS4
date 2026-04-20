package ejer5.negocio;

public class PerfilMedico {

    private String nombre;
    private String apellido;
    private String sexo;
    private int dia;
    private int mes;
    private int anio;
    private double altura;
    private double peso;

    public PerfilMedico(String nombre, String apellido, String sexo, int dia, int mes, int anio, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

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

    public double calcularBMI() {
        double alturaEnMetros = altura / 100.0;
        return peso / (alturaEnMetros * alturaEnMetros);
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Sexo: " + sexo);
        System.out.println("Fecha nacimiento: " + dia + "/" + mes + "/" + anio);
        System.out.println("Altura: " + altura + " cm");
        System.out.println("Peso: " + peso + " kg");
    }
}