/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica;

/**
 *
 * @author joeybustamante
 */
public class EmailNotificador implements Notificador {
    public void enviar(String mensaje) {
        System.out.println("Enviando email: " + mensaje);
    }
}
