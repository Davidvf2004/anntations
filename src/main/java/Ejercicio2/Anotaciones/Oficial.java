package Ejercicio2.Anotaciones;

import java.lang.annotation.*;

@Retention (RetentionPolicy.RUNTIME)
@Target (ElementType.TYPE)
@Repeatable (Oficiales.class)
public @interface Oficial {
    String nombre();
    String apellidos();
    String dni();
    String direccion();
    String telefono();
    String codigoTaller();
    String categoria();
}