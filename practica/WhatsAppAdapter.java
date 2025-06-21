/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica;

/**
 *
 * @author joeybustamante
 */
public class WhatsAppAdapter implements Notificador {
    private WhatsAppAPI api = new WhatsAppAPI();

    public void enviar(String mensaje) {
        api.sendMessage(mensaje);
    }
}
