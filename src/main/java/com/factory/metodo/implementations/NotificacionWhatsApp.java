package com.factory.metodo.implementations;

import com.factory.metodo.interfaces.Notificacion;

public class NotificacionWhatsApp implements Notificacion {
    @Override
    public String generarNotificacion() {
        return "Notificacion generada de WhatsApp";

    }

}
