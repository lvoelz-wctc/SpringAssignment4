package edu.wctc.spring;

import java.util.List;

public class ReportSummary implements SalesReport{
    @Override
    public void generateReport(List<Sale> salesList) {
        System.out.println("SALE SUMMARY REPORT");
        System.out.println("Country      Amount      Tax      Shipping");
        for (Sale sale : salesList) {
            System.out.println(sale.getCountry()+"     "+sale.getAmount()+"     "+sale.getTax()+"     "+sale.getShipping());
        }
    }
}
