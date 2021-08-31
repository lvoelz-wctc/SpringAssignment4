package edu.wctc.spring;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputSummary implements SalesInput{

    @Override
    public List<Sale> getSales() {
        List<Sale> saleList = new ArrayList<>();
        try {
            File myObj = new File("sales.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String listOfSaleInfo = myReader.nextLine();
                String[] array = listOfSaleInfo.split(",");

                //This gives us ([Customer], [Country], [Amount], [Tax])
                //Call the Detail constructor

                Sale sale = new Sale(array[1], Double.parseDouble(array[2]), Double.parseDouble(array[3]));
                saleList.add(sale);
            }
        }
        catch (IOException e){
            return saleList;
        }
        return saleList;
    }
}
