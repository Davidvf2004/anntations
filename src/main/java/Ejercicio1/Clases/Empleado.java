package Ejercicio1.Clases;

public class Empleado {
    String nombre;
    String apellidos;
    String dni;
    String direccion;
    String telefono;
    String clase;

    public Empleado(String nombre, String apellidos, String dni, String direccion, String telefono, String clase) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.clase = clase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre='" + nombre + '\'' + ", apellidos='" + apellidos + '\'' + ", dni='" + dni + '\'' + ", direccion='" + direccion + '\'' + ", telefono='" + telefono + '\'' + ", clase='" + clase + '\'' + '}';
    }
}