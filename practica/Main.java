/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica;

/**
 *
 * @author joeybustamante
 */
public class Main {
    public static void main(String[] args) {
        // Builder
        ReportDirector director = new ReportDirector();
        director.setBuilder(new PDFReportBuilder());
        Report report = director.constructReport();
        report.display();

        // Singleton
        ReportManager.getInstance().generateReport();

        // Decorator
        IReport decorated = new ColorDecorator(new FontStyleDecorator(new BasicReport()));
        decorated.display();

        // Factory
        IReportFactory factory = new PDFReportFactory();
        IReport reportFromFactory = factory.createReport();
        reportFromFactory.display();

        // Adapter
        Notificador notificador = new WhatsAppAdapter();
        notificador.enviar("Informe generado con éxito.");
    }
}
