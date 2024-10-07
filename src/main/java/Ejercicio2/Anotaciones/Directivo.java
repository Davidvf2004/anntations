package Ejercicio2.Anotaciones;

import java.lang.annotation.*;

@Retention (RetentionPolicy.RUNTIME)
@Target (ElementType.TYPE)
@Repeatable (Directivos.class)
public @interface Directivo {
    String nombre();
    String apellidos();
    String dni();
    String direccion();
    String telefono();
    String codigoDespacho();
}