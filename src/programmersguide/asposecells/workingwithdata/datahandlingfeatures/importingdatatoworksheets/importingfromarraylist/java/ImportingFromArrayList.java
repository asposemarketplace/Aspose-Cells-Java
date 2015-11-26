/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Cells. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.asposecells.workingwithdata.datahandlingfeatures.importingdatatoworksheets.importingfromarraylist.java;

import com.aspose.cells.*;

import java.util.ArrayList;

public class ImportingFromArrayList
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/asposecells/workingwithdata/datahandlingfeatures/importingdatatoworksheets/importingfromarraylist/data/";

        //Instantiating a Workbook object
        Workbook workbook = new Workbook();

        //Obtaining the reference of the worksheet
        Worksheet worksheet= workbook.getWorksheets().get(0);

        //Instantiating an ArrayList object
        ArrayList list=new ArrayList();

        //Add few names to the list as string values
        list.add("laurence chen");
        list.add("roman korchagin");
        list.add("kyle huang");
        list.add("tommy wang");

        //Importing the contents of ArrayList to 1st row and first column vertically
        worksheet.getCells().importArrayList(list,0,0,true);

        //Saving the Excel file
        workbook.save(dataDir + "DataImport.xls");

        //Printing the name of the cell found after searching worksheet
        System.out.println("Process completed successfully");

    }
}




