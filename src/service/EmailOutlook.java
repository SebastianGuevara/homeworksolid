package service;

import modelo.Envio;

public class EmailOutlook{

    ServidoresEmail servidoresEmail;

    public EmailOutlook(ServidoresEmail servidoresEmail) {
        this.servidoresEmail = servidoresEmail;
    }

    public void enviarEmail(Envio envio) {
        servidoresEmail.conectarConServidorEmail();
        System.out.println("EMAIL ENVIADO y correspondencia " + envio);
    }

}
