package Ejercicio3.Clases;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Builder
@Data
public class Tarea {
    @NonNull
    private String titulo;
    private String descripcion;
    private String diaSemana;
    private String hora;

    @Override
    public String toString() {
        return "Tarea{" + "titulo='" + titulo + '\'' + ", descripcion='" + descripcion + '\'' + ", diaSemana='" + diaSemana + '\'' + ", hora='" + hora + '\'' + '}';
    }
}