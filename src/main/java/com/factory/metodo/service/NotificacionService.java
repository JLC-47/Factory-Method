package com.factory.metodo.service;

import com.factory.metodo.factory.NotificacionFactory;
import com.factory.metodo.interfaces.Notificacion;

public class NotificacionService {
    
    public String crearNotificacion( String tipo){

        Notificacion notificacion = NotificacionFactory.crearNotificacion(tipo);

        return notificacion.generarNotificacion();
    }
}
