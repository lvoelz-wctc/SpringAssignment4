package edu.wctc.spring;

import java.util.List;

public class ReportDetail implements SalesReport{
    @Override
    public void generateReport(List<Sale> salesList) {
        System.out.println("SALE DETAIL REPORT");
        System.out.println("Customer      Country      Amount      Tax      Shipping");
        for (Sale sale : salesList) {
            System.out.println(sale.getCustomer()+"     "+sale.getCountry()+"     "+sale.getAmount()+"     "+sale.getTax()+"     "+sale.getShipping());
        }
    }
}
