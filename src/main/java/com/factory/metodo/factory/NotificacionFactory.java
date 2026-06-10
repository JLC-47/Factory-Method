package com.factory.metodo.factory;

import com.factory.metodo.implementations.NotificacionEmail;
import com.factory.metodo.implementations.NotificacionSMS;
import com.factory.metodo.implementations.NotificacionWhatsApp;
import com.factory.metodo.interfaces.Notificacion;

public class NotificacionFactory {
    
    public static Notificacion crearNotificacion( String tipo){

        if (tipo.equalsIgnoreCase("Email")) {
            
            return new NotificacionEmail();

        }

        if (tipo.equalsIgnoreCase("SMS")) {
            
            return new NotificacionSMS();

        }

        if (tipo.equalsIgnoreCase("WhatsApp")) {
            
            return new NotificacionWhatsApp();

        }

        throw new IllegalArgumentException("Tipo de mensaje no valido");



        
    }
}
