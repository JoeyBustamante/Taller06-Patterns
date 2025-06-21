/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica;

/**
 *
 * @author joeybustamante
 */
public class Report {
    private StringBuilder content = new StringBuilder();

    public void add(String part) {
        content.append(part).append("\n");
    }

    public void display() {
        System.out.println(content.toString());
    }
}
