package modelo;

import service.EmailOutlook;

import java.util.ArrayList;

public class Industrial extends Carrera {

    Envio envio;
    EmailOutlook email;
    public Industrial(Envio envio, EmailOutlook email) {
        super(envio, email);
        this.envio = envio;
        this.email = email;
    }

    @Override
    public void consultarMateriasCarrera()
    {
        System.out.println("Procesos, Analitica de datos, Gestion de Calidad ");
    }

    @Override
    public void obtenerMaterialCarrera()
    {
        envio.material = new ArrayList<>();
        envio.material.add("Casco");
        envio.material.add("Calculadora");
    }

    @Override
    public void obtenerSaludoDirectorCarrera()
    {
        envio.saludoDirector = "El director de Industrial envia saludos";
    }

    @Override
    public void enviarDatosCarrera()
    {
        email.enviarEmail(envio);
    }
}
