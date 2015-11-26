/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Cells. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.asposecells.workingwithdata.addonfeatures.namedranges.createnamedrangeofcells.java;

import com.aspose.cells.*;

public class CreateNamedRangeofCells
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/asposecells/workingwithdata/addonfeatures/namedranges/createnamedrangeofcells/data/";

        //Instantiating a Workbook object
        Workbook workbook = new Workbook(dataDir + "book1.xls");

        WorksheetCollection worksheets = workbook.getWorksheets();

        //Accessing the first worksheet in the Excel file
        Worksheet sheet = worksheets.get(0);
        Cells cells = sheet.getCells();

        //Creating a named range
        Range namedRange = cells.createRange("B4", "G14");
        namedRange.setName("TestRange");

        //Saving the modified Excel file in default (that is Excel 2000) format
        workbook.save(dataDir + "output.xls");

        // Print message
        System.out.println("Process completed successfully");
    }
}




