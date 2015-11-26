/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Cells. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.asposecells.workingwithrowsandcolumns.adjustingrowheightandcolumnwidth.java;

import com.aspose.cells.*;

public class AdjustingRowHeightandColumnWidth
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/asposecells/workingwithrowsandcolumns/adjustingrowheightandcolumnwidth/data/";
        
        //Instantiating a Workbook object
        Workbook workbook = new Workbook(dataDir + "workbook.xls");

        //Accessing the first worksheet in the Excel file
        Worksheet worksheet = workbook.getWorksheets().get(0);
        Cells cells = worksheet.getCells();

        //============== Setting Row Height ==============
        //Setting the height of the second row to 40
        cells.setRowHeight(1, 40);

        //Setting the height of all rows in the worksheet to 15
        //worksheet.getCells().setStandardHeight(15f);
        
        //============== Setting Column Width ============
        //Setting the width of the second column to 17.5
        cells.setColumnWidth(1, 50);
        
        //Setting the width of all columns in the worksheet to 20.5
        //worksheet.getCells().setStandardWidth(20.5f);
        
        //Saving the modified Excel file in default (that is Excel 2003) format
        workbook.save(dataDir + "workbook.output.xls");
        
        //Print message
        System.out.println("Height and width modified successfully.");
    }
}