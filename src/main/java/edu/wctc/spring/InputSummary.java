package edu.wctc.spring;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputSummary implements SalesInput{

    private static final List<Sale> saleList = new ArrayList<>();

    @Override
    public List<Sale> getSales(File myObj) throws FileNotFoundException {
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String listOfSaleInfo = myReader.nextLine();
            String[] array = listOfSaleInfo.split(",");

            //This gives us ([Customer], [Country], [Amount], [Tax])
            //Call the Summary constructor and don't send customer

            Sale sale = new Sale(array[1], Double.parseDouble(array[2]), Double.parseDouble(array[3]));
            saleList.add(sale);
        }
        return saleList;
    }
}
