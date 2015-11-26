/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Cells. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.asposecells.workingwithworksheets.securityfeatures.unprotectworksheet.unprotectingpasswordprotectedworksheet.java;

import com.aspose.cells.*;

public class UnprotectingPasswordProtectedWorksheet
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/asposecells/workingwithworksheets/securityfeatures/unprotectworksheet/unprotectingpasswordprotectedworksheet/data/";

        //Instantiating a Workbook object
        Workbook workbook = new Workbook(dataDir + "book1.xls");

        WorksheetCollection worksheets = workbook.getWorksheets();
        Worksheet worksheet = worksheets.get(0);

        Protection protection = worksheet.getProtection();

        //Unprotecting the worksheet with a password
        worksheet.unprotect("aspose");

        // Save the excel file.
        workbook.save(dataDir + "output.xls", FileFormatType.EXCEL_97_TO_2003);
        
        //Print Message
        System.out.println("Worksheet unprotected successfully.");
    }
}




