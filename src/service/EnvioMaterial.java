package service;

import modelo.Envio;
import modelo.Estudiante;

import java.util.ArrayList;

public class EnvioMaterial {

    public void enviarMaterialEstudiante(Estudiante estudiante)
    {
        estudiante.carrera.obtenerMaterialCarrera();
        estudiante.carrera.obtenerSaludoDirectorCarrera();
        estudiante.carrera.enviarDatosCarrera();
    }
}
