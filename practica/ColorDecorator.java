/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica;

/**
 *
 * @author joeybustamante
 */
public class ColorDecorator extends ReportDecorator {
    public ColorDecorator(IReport report) {
        super(report);
    }

    public void display() {
        decoratedReport.display();
        System.out.println(" + Color personalizado");
    }
}