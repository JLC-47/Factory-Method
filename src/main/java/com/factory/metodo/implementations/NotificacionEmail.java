package com.factory.metodo.implementations;

import com.factory.metodo.interfaces.Notificacion;

public class NotificacionEmail implements Notificacion {
    

    @Override
    public String generarNotificacion() {
        return "Notificacion generada de email";

    }

}
