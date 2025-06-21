/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica;

/**
 *
 * @author joeybustamante
 */
public class PDFReportFactory implements IReportFactory {
    public IReport createReport() {
        return new BasicReport(); // o una clase PDFReport
    }
}
