package modelo;

import service.EmailOutlook;

import java.util.ArrayList;

public class Informatica extends Carrera
{
    Envio envio;
    EmailOutlook email;
    public Informatica(Envio envio, EmailOutlook email)
    {
        super(envio, email);
        this.envio = envio;
        this.email = email;
    }

    @Override
    public void consultarMateriasCarrera()
    {
        System.out.println("Programacion, Arquitectura, Base de datos");
    }

    @Override
    public void obtenerMaterialCarrera()
    {
        envio.material = new ArrayList<>();
        envio.material.add("Computador");
        envio.material.add("Mouse");
    }

    @Override
    public void obtenerSaludoDirectorCarrera()
    {
        envio.saludoDirector = "Jenny envia saludos";
    }

    @Override
    public void enviarDatosCarrera()
    {
        email.enviarEmail(envio);
    }
}
