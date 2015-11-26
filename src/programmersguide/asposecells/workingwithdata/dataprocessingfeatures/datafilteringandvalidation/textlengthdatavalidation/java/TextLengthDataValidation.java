/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Cells. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.asposecells.workingwithdata.dataprocessingfeatures.datafilteringandvalidation.textlengthdatavalidation.java;

import com.aspose.cells.*;

public class TextLengthDataValidation
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/asposecells/workingwithdata/dataprocessingfeatures/datafilteringandvalidation/textlengthdatavalidation/data/";

        // Create a new workbook.
        Workbook workbook = new Workbook();

        // Obtain the cells of the first worksheet.
        Cells cells = workbook.getWorksheets().get(0).getCells();

        //Put a string value into A1 cell.
        cells.get("A1").setValue("Please enter a string not more than 5 chars");

        // Wrap the text.
        Style style = cells.get("A1").getStyle();
        style.setTextWrapped(true);
        cells.get("A1").setStyle(style);

        // Set row height and column width for the cells.
        cells.setRowHeight(0, 31);
        cells.setColumnWidth(0, 35);

        // Get the validations collection.
        ValidationCollection validations = workbook.getWorksheets().get(0).getValidations();

        // Add a new validation.
        int i = validations.add();
        Validation validation = validations.get(i);

        // Set the data validation type.
        validation.setType(ValidationType.TEXT_LENGTH);

        // Set the operator for the data validation.
        validation.setOperator(OperatorType.LESS_OR_EQUAL);

        // Set the value or expression associated with the data validation.
        validation.setFormula1("5");

        // Enable the error.
        validation.setShowError(true);

        // Set the validation alert style.
        validation.setAlertStyle(ValidationAlertType.WARNING);

        // Set the title of the data-validation error dialog box.
        validation.setErrorTitle("Text Length Error");

        // Set the data validation error message.
        validation.setErrorMessage(" Enter a Valid String");

        // Set and enable the data validation input message.
        validation.setInputMessage("TextLength Validation Type");
        validation.setIgnoreBlank(true);
        validation.setShowInput(true);

        // Set a collection of CellArea which contains the data validation settings.
        CellArea area = new CellArea();

        area.StartRow = 0;
        area.StartColumn = 1;
        area.EndRow = 0;
        area.EndColumn = 1;

        // Add the Validation area.
        validation.addArea(area);

        // Save the excel file.
        workbook.save(dataDir + "output.xls", FileFormatType.EXCEL_97_TO_2003);

        // Print message
        System.out.println("Process completed successfully");

    }
}




