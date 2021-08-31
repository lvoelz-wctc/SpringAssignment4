package edu.wctc.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.*;
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner; // Import the Scanner class to read text files
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Main {







    public static void main(String[] args) throws FileNotFoundException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        ((SaleBuilder)context.getBean("saleBuilder")).getSaleReport();




}}
