package edu.wctc.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class SaleBuilder {
    private static SalesInput si;
    private static SalesReport sr;
    private static ShippingPolicy sp;

    /**private static final List<Sale> saleList = new ArrayList<>();**/


    @Autowired
    public SaleBuilder(SalesInput si, SalesReport sr, ShippingPolicy sp) {
        SaleBuilder.si = si;
        SaleBuilder.sr = sr;
        SaleBuilder.sp = sp;
        System.out.println("Sale Builder created");
    }

    /**one method that performs all three steps**/
    public void getSaleReport(){
        List<Sale> saleReport = si.getSales();
        List<Sale> saleReportWithTax = sp.getShippingCost(saleReport);
        sr.generateReport(saleReportWithTax);
    }
}
