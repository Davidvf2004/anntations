package Ejercicio1.Anotaciones;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable (Empleados.class)
public @interface Empleado {
    String nombre();
    String apellidos();
    String dni();
    String direccion();
    String telefono();
    String clase();
    String codigoDespacho();
}