package edu.wctc.spring;

import java.util.List;

public class FlatDomesticShipping implements ShippingPolicy{

    @Override
    public List<Sale> getShippingCost(List<Sale> saleList) {
        for (Sale sale : saleList){
            double shipping = (sale.getAmount() * .1);
            sale.setShipping(shipping);
        }
        return saleList;
    }
}
