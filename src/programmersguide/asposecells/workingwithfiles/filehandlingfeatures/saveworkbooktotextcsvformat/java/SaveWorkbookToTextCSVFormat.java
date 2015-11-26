/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Cells. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.asposecells.workingwithfiles.filehandlingfeatures.saveworkbooktotextcsvformat.java;

import com.aspose.cells.*;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;


public class SaveWorkbookToTextCSVFormat
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/asposecells/workingwithfiles/filehandlingfeatures/saveworkbooktotextcsvformat/data/";
        
        
	//Load your source workbook
	Workbook workbook = new Workbook(dataDir + "book1.xls");

	//0-byte array
	byte[] workbookData = new byte[0];

	//Text save options. You can use any type of separator
	TxtSaveOptions opts = new TxtSaveOptions();
	opts.setSeparator('\t');

	//Copy each worksheet data in text format inside workbook data array
	for (int idx = 0; idx < workbook.getWorksheets().getCount(); idx++)
	{
    		//Save the active worksheet into text format
    		ByteArrayOutputStream bout = new ByteArrayOutputStream();
    		workbook.getWorksheets().setActiveSheetIndex(idx);
    		workbook.save(bout, opts);

    		//Save the worksheet data into sheet data array
    		byte[] sheetData = bout.toByteArray();

    		//Combine this worksheet data into workbook data array
   		byte[] combinedArray = new byte[workbookData.length + sheetData.length];
    		System.arraycopy(workbookData, 0, combinedArray, 0, workbookData.length);
    		System.arraycopy(sheetData, 0, combinedArray, workbookData.length, sheetData.length);

    		workbookData = combinedArray;
	}


	//Save entire workbook data into file
	FileOutputStream fout = new FileOutputStream(dataDir + ".out.txt");
	fout.write(workbookData);
	fout.close();

        // Print message
        System.out.println("Excel to Text File Conversion performed successfully.");
    }
}




