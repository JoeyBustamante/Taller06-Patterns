/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica;

/**
 *
 * @author joeybustamante
 */
public class ReportDirector {
    private ReportBuilder builder;

    public ReportDirector() {}

    public ReportDirector(ReportBuilder builder) {
        this.builder = builder;
    }

    public void setBuilder(ReportBuilder builder) {
        this.builder = builder;
    }

    public Report constructReport() {
        builder.buildHeader();
        builder.buildBody();
        builder.buildFooter();
        return builder.getReport();
    }
}
