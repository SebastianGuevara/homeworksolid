package modelo;

import service.EmailOutlook;

public abstract class Carrera
{
    private Envio envio;
    private  EmailOutlook email;
    public Carrera(Envio envio, EmailOutlook email)
    {
        this.envio = envio;
        this.email = email;
    }

    public abstract void consultarMateriasCarrera();

    public abstract void obtenerMaterialCarrera();

    public abstract void obtenerSaludoDirectorCarrera();

    public abstract void enviarDatosCarrera();
}
