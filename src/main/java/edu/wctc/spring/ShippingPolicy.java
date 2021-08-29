package edu.wctc.spring;

import java.util.List;

public interface ShippingPolicy {
    List<Sale> getShippingCost(List<Sale> saleList);
}
