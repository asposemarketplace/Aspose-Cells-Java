/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Cells. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.asposecells.workingwithdata.addonfeatures.mergingunmergingcells.mergingcellsinworksheet.java;

import com.aspose.cells.*;

public class MergingCellsInWorksheet
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/asposecells/workingwithdata/addonfeatures/mergingunmergingcells/mergingcellsinworksheet/data/";

        //Create a Workbook.
        Workbook wbk=new Workbook();

        //Create a Worksheet and get the first sheet.
        Worksheet worksheet = wbk.getWorksheets().get(0);

        //Create a Cells object to fetch all the cells.
        Cells cells = worksheet.getCells();

        //Merge some Cells (C6:E7) into a single C6 Cell.
        cells.merge(5,2,2,3);

        //Input data into C6 Cell.
        worksheet.getCells().get(5,2).setValue("This is my value");

        //Create a Style object to fetch the Style of C6 Cell.
        Style style = worksheet.getCells().get(5,2).getStyle();

        //Create a Font object
        Font font = style.getFont();

        //Set the name.
        font.setName("Times New Roman");

        //Set the font size.
        font.setSize(18);

        //Set the font color
        font.setColor(Color.getBlue());

        //Bold the text
        font.setBold(true);

        //Make it italic
        font.setItalic(true);

        //Set the backgrond color of C6 Cell to Red
        style.setForegroundColor(Color.getRed());
        style.setPattern(BackgroundType.SOLID);

        //Apply the Style to C6 Cell.
        cells.get(5,2).setStyle(style);

        //Save the Workbook.
        wbk.save(dataDir + "mergingcells.xls");

        // Print message
        System.out.println("Process completed successfully");
    }
}




