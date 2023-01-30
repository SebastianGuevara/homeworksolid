package main;

import modelo.*;
import service.EmailOutlook;
import service.EnvioMaterial;

public class Main {
    public static void main(String[] args) {
        Estudiante[] listadoEstudiantes = {
                new Estudiante("Daniel", new Informatica(new Envio(), new EmailOutlook())),
                new Estudiante("Monica", new Administracion(new Envio(), new EmailOutlook())),
                new Estudiante("Liliana", new Industrial(new Envio(), new EmailOutlook()))
        };
        verMateriasEstudiantes(listadoEstudiantes);
        EnvioMaterial material = new EnvioMaterial();
        material.enviarMaterialEstudiante(new Estudiante("Daniel", new Informatica(new Envio(), new EmailOutlook())));
    }

    public static void verMateriasEstudiantes(Estudiante[] estudiantes) {
        for (Estudiante estudiante : estudiantes)
        {
            estudiante.carrera.consultarMateriasCarrera();
        }
    }
}
