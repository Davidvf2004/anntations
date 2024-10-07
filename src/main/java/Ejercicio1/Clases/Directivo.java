package Ejercicio1.Clases;

public class Directivo extends Empleado{
    private String codigoDespacho;

    public Directivo(String nombre, String apellidos, String dni, String direccion, String telefono, String clase, String codigoDespacho) {
        super (nombre, apellidos, dni, direccion, telefono, clase);
    }

    public String getCodigoDespacho() {
        return codigoDespacho;
    }

    public void setCodigoDespacho(String codigoDespacho) {
        this.codigoDespacho = codigoDespacho;
    }

    @Override
    public String toString() {
        return super.toString ();
    }
}