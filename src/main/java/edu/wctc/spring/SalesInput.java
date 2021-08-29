package edu.wctc.spring;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public interface SalesInput {
    //read each line of sales.txt
    List<Sale> getSales(File myObj) throws FileNotFoundException;
}
