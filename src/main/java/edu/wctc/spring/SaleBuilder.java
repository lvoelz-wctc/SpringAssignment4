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
    private SalesInput si;
    private SalesReport sr;
    private ShippingPolicy sp;

    private List<Sale> saleList;

    @Autowired
    public SaleBuilder(SalesInput si, SalesReport sr, ShippingPolicy sp) {
        this.si = si;
        this.sr = sr;
        this.sp = sp;
        System.out.println("Sale Builder created");
    }

    /**
    private List<Sale> createReport() throws FileNotFoundException {
        File myObj = new File("sales.txt");
        System.out.println("Report created");
        return si.getSales(myObj);
    }

    private List<Sale> calculateShipping(List<Sale> saleList) throws FileNotFoundException {
        System.out.println("Shipping calculated.");
        return sp.getShippingCost(createReport());
    }

    public void showReport(List<Sale> saleList) {
        System.out.println("Generating report...");
    }**/
}
