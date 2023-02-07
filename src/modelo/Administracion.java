package modelo;

import service.EmailOutlook;

import java.util.ArrayList;

public class Administracion extends Carrera
{

    Envio envio;
    EmailOutlook email;

    public Administracion(Envio envio, EmailOutlook email) {
        super(envio, email);
        this.envio = envio;
        this.email = email;
    }

    @Override
    public void consultarMateriasCarrera()
    {
        System.out.println("Negocios, Administracion I, Historia de la Administracion");
    }

    @Override
    public void obtenerMaterialCarrera()
    {
        envio.material = new ArrayList<>();
        envio.material.add("Calendario");
        envio.material.add("Esferos de colores");
    }

    @Override
    public void obtenerSaludoDirectorCarrera()
    {
        envio.saludoDirector = "El director de administracion envia saludos";
    }

    @Override
    public void enviarDatosCarrera()
    {
        email.enviarEmail(envio);
    }

}
