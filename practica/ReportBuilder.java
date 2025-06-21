/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.practica;

/**
 *
 * @author joeybustamante
 */
public interface ReportBuilder {
    public void buildHeader();
    public void buildBody();
    public void buildFooter();
    public Report getReport();
}
