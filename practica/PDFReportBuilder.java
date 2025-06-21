/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica;

/**
 *
 * @author joeybustamante
 */
public class PDFReportBuilder implements ReportBuilder {
    private Report report = new Report();

    public void buildHeader() {
        report.add("PDF Header");
    }

    public void buildBody() {
        report.add("PDF Body");
    }

    public void buildFooter() {
        report.add("PDF Footer");
    }

    public Report getReport() {
        return report;
    }
}
