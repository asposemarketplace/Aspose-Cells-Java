/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Cells. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.asposecells.workingwithdata.addonfeatures.namedranges.formatranges1.java;

import com.aspose.cells.*;

public class FormatRanges1
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/asposecells/workingwithdata/addonfeatures/namedranges/formatranges1/data/";

        //Instantiate a new Workbook.
        Workbook workbook = new Workbook();

        //Get the first worksheet in the book.
        Worksheet WS = workbook.getWorksheets().get(0);

        //Create a named range of cells.
        com.aspose.cells.Range range = WS.getCells().createRange(1, 1, 1, 17);
        range.setName("MyRange");

        //Declare a style object.
        Style stl;

        //Create the style object with respect to the style of a cell.
        stl= WS.getCells().get(1,1).getStyle();

        //Specify some Font settings.
        stl.getFont().setName("Arial");
        stl.getFont().setBold(true);

        //Set the font text color
        stl.getFont().setColor(Color.getRed());

        //To Set the fill color of the range, you may use ForegroundColor with
        //solid Pattern setting.
        stl.setBackgroundColor(Color.getYellow());
        stl.setPattern(BackgroundType.SOLID);

        //Apply the style to the range.
        for (int r = 1;r<2;r++)
        {
            for (int c = 1; c<18;c++)
            {
                WS.getCells().get(r,c).setStyle(stl);
            }

        }

        //Save the excel file.
        workbook.save(dataDir + "rangestyles.xls");

        // Print message
        System.out.println("Process completed successfully");
    }
}




