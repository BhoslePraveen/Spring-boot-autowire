package com.velocity.demo.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ReportService2 {
    //Global Variable
    private IReport iReport;

    @Autowired // If u have only one constructor then no need to add this annotation
    public ReportService2(@Qualifier("excel") IReport iReport) {
        System.out.println("Constructor based injection called");
        this.iReport = iReport;
        System.out.println("Injected Bean name is : " + iReport.getClass().getName());
    }

    public ReportService2(){
        System.out.println("Helo");
    }

    public void downloadReport() {
        System.out.println(iReport.report());
    }
}
