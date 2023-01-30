package main;

import modelo.*;
import service.EmailOutlook;
import service.EnvioMaterial;
import service.ServidoresEmail;

public class Main {
    public static void main(String[] args) {
        Estudiante[] listadoEstudiantes = {
                new Estudiante("Daniel", new Informatica(new Envio(), new EmailOutlook(new ServidoresEmail()))),
                new Estudiante("Monica", new Administracion(new Envio(), new EmailOutlook(new ServidoresEmail()))),
                new Estudiante("Liliana", new Industrial(new Envio(), new EmailOutlook(new ServidoresEmail())))
        };
        verMateriasEstudiantes(listadoEstudiantes);
        EnvioMaterial material = new EnvioMaterial();
        material.enviarMaterialEstudiante(new Estudiante("Daniel", new Informatica(new Envio(), new EmailOutlook(new ServidoresEmail()))));
        material.enviarMaterialEstudiante(new Estudiante("Juanito", new Administracion(new Envio(), new EmailOutlook(new ServidoresEmail()))));
        material.enviarMaterialEstudiante(new Estudiante("Sebitas", new Industrial(new Envio(), new EmailOutlook(new ServidoresEmail()))));
    }

    public static void verMateriasEstudiantes(Estudiante[] estudiantes)
    {
        for (Estudiante estudiante : estudiantes)
        {
            estudiante.carrera.consultarMateriasCarrera();
        }
    }
}
