/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica;

/**
 *
 * @author joeybustamante
 */
public class ReportManager {
    private static ReportManager instance;

    private ReportManager() {}

    public static ReportManager getInstance() {
        if (instance == null) {
            instance = new ReportManager();
        }
        return instance;
    }

    public void generateReport() {
        System.out.println("Generando reporte único...");
    }
}
