package edu.wctc.spring;

import java.util.List;

public interface SalesReport {
    void generateReport(List<Sale> salesList);
}
