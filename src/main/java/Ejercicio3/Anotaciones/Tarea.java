package Ejercicio3.Anotaciones;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(Tareas.class)
public @interface Tarea {
    String titulo();
    String descripcion();
    String diaSemana();
    String hora();
}