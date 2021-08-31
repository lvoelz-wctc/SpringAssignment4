package edu.wctc.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class AppConfig {
    @Bean
    public SalesInput salesInput() {
        return new InputSummary();
        //return new InputDetail();
    }

    @Bean
    public ShippingPolicy shippingPolicy() {
        return new FlatDomesticShipping();
        //return new FreeShipping();
    }

    @Bean
    public SalesReport salesReport() {
         return new ReportSummary();
        //return new ReportDetail();
    }
}
