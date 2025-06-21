/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica;

/**
 *
 * @author joeybustamante
 */
public class FontStyleDecorator extends ReportDecorator {
    public FontStyleDecorator(IReport report) {
        super(report);
    }

    public void display() {
        decoratedReport.display();
        System.out.println(" + Fuente personalizada");
    }
}