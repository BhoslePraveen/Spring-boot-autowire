package com.velocity.demo.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class ReportService {
    //Global Variable
    private IReport excelReport;

    @Autowired
    public ReportService(IReport excelReport) {
        System.out.println("Constructor based injection called");
        this.excelReport = excelReport;
        System.out.println("Injected Bean name is : " + excelReport.getClass().getName());
    }

    public void downloadReport() {
        System.out.println(excelReport.report());
    }

}
