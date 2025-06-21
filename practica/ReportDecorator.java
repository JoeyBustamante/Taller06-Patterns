/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica;

/**
 *
 * @author joeybustamante
 */
public abstract class ReportDecorator implements IReport {
    protected IReport decoratedReport;

    public ReportDecorator(IReport report) {
        this.decoratedReport = report;
    }
}
