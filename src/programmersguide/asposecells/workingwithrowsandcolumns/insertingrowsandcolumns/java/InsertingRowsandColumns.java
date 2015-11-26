/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Cells. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.asposecells.workingwithrowsandcolumns.insertingrowsandcolumns.java;

import com.aspose.cells.*;

public class InsertingRowsandColumns
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/asposecells/workingwithrowsandcolumns/insertingrowsandcolumns/data/";
        
        //Instantiating a Workbook object
        Workbook workbook = new Workbook(dataDir + "workbook.xls");

        //Accessing the first worksheet in the Excel file
        Worksheet worksheet = workbook.getWorksheets().get(0);

        // ================== INSERTING ROWS ==================
        
        //Inserting a row into the worksheet at 6th position
        worksheet.getCells().insertRow(5);
        
        //Inserting 3 rows into the worksheet starting from 8th row
        worksheet.getCells().insertRows(7,3);

        // ================== INSERTING COLUMNS ===============

        //Inserting a column into the worksheet at 4th position
        worksheet.getCells().insertColumn(3);

        //Inserting 3 columns into the worksheet at 6th position
        worksheet.getCells().insertColumns(5,3);
        
        //Saving the modified Excel file in default (that is Excel 2000) format
        workbook.save(dataDir + "workbook.out.xls");
        
        //Print message
        System.out.println("Rows and Columns inserted successfully.");   
    }
}