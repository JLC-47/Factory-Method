package com.factory.metodo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.factory.metodo.service.NotificacionService;

@RestController
@RequestMapping("/notificaciones")
public class NotificacionController {
    
    @Autowired
    private NotificacionService service;

    public String crear(@PathVariable String tipo){
        
        return service.crearNotificacion(tipo); 

    }
}
