package Ejercicio1.Clases;

public class Operario extends Empleado{
    private String codigoTaller;

    public Operario(String nombre, String apellidos, String dni, String direccion, String telefono, String clase, String codigoTaller) {
        super (nombre, apellidos, dni, direccion, telefono, clase);
        this.codigoTaller = codigoTaller;
    }

    public String getCodigoTaller() {
        return codigoTaller;
    }

    public void setCodigoTaller(String codigoTaller) {
        this.codigoTaller = codigoTaller;
    }

    @Override
    public String toString() {
        return super.toString ();
    }
}