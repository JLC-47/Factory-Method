package com.factory.metodo.implementations;

import com.factory.metodo.interfaces.Notificacion;

public class NotificacionSMS implements Notificacion {

    @Override
    public String generarNotificacion() {
        return "Notificacion generada de SMS";

    }

}
