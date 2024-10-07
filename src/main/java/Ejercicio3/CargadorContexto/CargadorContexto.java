package Ejercicio3.CargadorContexto;

import Ejercicio3.Clases.AgendaSemana;
import Ejercicio3.Clases.Tarea;
import java.util.ArrayList;
import java.util.List;

public class CargadorContexto {

    public static String cargaContextoTareas() {
        Ejercicio3.Anotaciones.Tarea[] tareaAnnotations = AgendaSemana.class.getAnnotationsByType(Ejercicio3.Anotaciones.Tarea.class);
        List<Tarea> tareas = new ArrayList<>();

        for (Ejercicio3.Anotaciones.Tarea tareaAnnotation : tareaAnnotations) {
            tareas.add(Tarea.builder().titulo(tareaAnnotation.titulo()).descripcion(tareaAnnotation.descripcion()).hora(tareaAnnotation.hora()).diaSemana(tareaAnnotation.diaSemana()).build());
        }

        StringBuilder resultado = new StringBuilder();
        for (Tarea tarea : tareas) {
            resultado.append(tarea).append("\n");
        }

        return resultado.toString();
    }
}