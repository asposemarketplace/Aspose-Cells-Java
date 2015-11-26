/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Cells. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.asposecells.workingwithrowsandcolumns.hidingrowsandcolumns.java;

import com.aspose.cells.*;

public class HidingRowsandColumns
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/asposecells/workingwithrowsandcolumns/hidingrowsandcolumns/data/";

        //Instantiating a Workbook object
        Workbook workbook = new Workbook(dataDir + "workbook.xls");

        //Accessing the first worksheet in the Excel file
        Worksheet worksheet = workbook.getWorksheets().get(0);
        Cells cells = worksheet.getCells();

        //Hiding the 3rd row of the worksheet      
        cells.hideRow(2);

        //Hiding the 2nd column of the worksheet
        cells.hideColumn(1);

        //Saving the modified Excel file in default (that is Excel 2003) format
        workbook.save(dataDir + "workbook.out.xls");

        //Print message
        System.out.println("Rows and Columns hidden successfully.");           

    }
}