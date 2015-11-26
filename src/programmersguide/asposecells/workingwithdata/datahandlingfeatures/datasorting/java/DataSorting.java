/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Cells. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.asposecells.workingwithdata.datahandlingfeatures.datsorting.java;

import com.aspose.cells.*;

public class DataSorting
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/asposecells/workingwithdata/datahandlingfeatures/datasorting/data/";

        //Instantiate a new Workbook object.
        Workbook workbook = new Workbook(dataDir + "book1.xls");

        //Get the workbook datasorter object.
        DataSorter sorter = workbook.getDataSorter();

        //Set the first order for datasorter object.
        sorter.setOrder1(SortOrder.DESCENDING);

        //Define the first key.
        sorter.setKey1(0);

        //Set the second order for datasorter object.
        sorter.setOrder2(SortOrder.ASCENDING);

        //Define the second key.
        sorter.setKey2(1);

        //Sort data in the specified data range (CellArea range: A1:B14)
        CellArea cellArea = new CellArea();
        cellArea.StartRow = 0;
        cellArea.StartColumn = 0;
        cellArea.EndRow = 13;
        cellArea.EndColumn = 1;
        sorter.sort(workbook.getWorksheets().get(0).getCells(), cellArea);

        //Save the excel file.
        workbook.save(dataDir + "output.xls");

        // Print message
        System.out.println("Sorting Done Successfully");
    }
}




