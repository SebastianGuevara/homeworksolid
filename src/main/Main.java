package main;

import modelo.Administracion;
import modelo.Estudiante;
import modelo.Industrial;
import modelo.Informatica;
import service.EnvioMaterial;

public class Main {
    public static void main(String[] args) {
        Estudiante[] listadoEstudiantes = {
                new Estudiante("Daniel", new Informatica()),
                new Estudiante("Monica", new Administracion()),
                new Estudiante("Liliana", new Industrial())
        };
        verMateriasEstudiantes(listadoEstudiantes);
        EnvioMaterial material = new EnvioMaterial();
        material.enviarMaterialEstudiante(new Estudiante("Daniel", new Informatica()));
    }

    public static void verMateriasEstudiantes(Estudiante[] estudiantes) {
        for (Estudiante estudiante : estudiantes)
        {
            estudiante.carrera.consultarMaterias();
        }
    }
}
