package Ejercicio1.Clases;

import Ejercicio1.CargadorContexto.CargadorContexto;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println ("BIENVENIDO A LA EMPRESA");
        System.out.println ("CARGANDO EMPLEADOS...");

        List<Ejercicio1.Clases.Empleado> empleados = CargadorContexto.cargaContextoEmpresa ();

        for(Ejercicio1.Clases.Empleado empleado : empleados) {
            System.out.println (empleado);
        }
    }
}