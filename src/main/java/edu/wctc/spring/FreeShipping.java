package edu.wctc.spring;

import java.util.List;

public class FreeShipping implements ShippingPolicy{

    @Override
    public List<Sale> getShippingCost(List<Sale> saleList) {
        for (Sale sale : saleList){
            sale.setShipping(0);
        }
        return saleList;
    }
}
