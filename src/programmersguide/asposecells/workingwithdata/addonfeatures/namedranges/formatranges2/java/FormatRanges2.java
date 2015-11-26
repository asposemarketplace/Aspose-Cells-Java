/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Cells. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.asposecells.workingwithdata.addonfeatures.namedranges.formatranges2.java;

import com.aspose.cells.*;

public class FormatRanges2
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/asposecells/workingwithdata/addonfeatures/namedranges/formatranges2/data/";

        //Instantiating a Workbook object
        Workbook workbook = new Workbook();

        //Adding a new worksheet to the Workbook object
        //Obtaining the reference of the newly added worksheet
        int sheetIndex = workbook.getWorksheets().add();
        Worksheet worksheet = workbook.getWorksheets().get(sheetIndex);

        //Accessing the "A1" cell from the worksheet
        Cell cell = worksheet.getCells().get("A1");

        //Adding some value to the "A1" cell
        cell.setValue("Hello World From Aspose");

        //Creating a range of cells starting from "A1" cell to 3rd column in a row
        Range range = worksheet.getCells().createRange("A1:C1");
        range.setName("MyRange");

        //Adding a thick outline border with the blue line
        range.setOutlineBorders(CellBorderType.THICK, Color.getBlue());

        //Saving the Excel file
        workbook.save(dataDir + "book1.xls");

        // Print message
        System.out.println("Process completed successfully");
    }
}




