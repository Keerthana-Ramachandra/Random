package genericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This class contains reusable methods related to excel file
 * @author Keerthi
 *
 */
public class ExcelFileUtility
{
/**
 * This method will read string data from excel file
 * @param sheetName
 * @param rowNumber
 * @param cellNumber
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */
	
	
public String readDataFromExcelFileWithStringValue(String sheetName, int rowNumber, int cellNumber) throws EncryptedDocumentException, IOException
{
	FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\FacebookRegestrationdata.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String value = wb.getSheet(sheetName).getRow(rowNumber).getCell(cellNumber).getStringCellValue();
	wb.close();
	return value;
}

/**
 * This method will read numeric data from excel file
 * @param sheetName
 * @param rowNumber
 * @param cellNumber
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */
	
	
public double readDataFromExcelFileWithNumericValue(String sheetName, int rowNumber, int cellNumber) throws EncryptedDocumentException, IOException
{
	FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\FacebookRegestrationdata.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	double value = wb.getSheet(sheetName).getRow(rowNumber).getCell(cellNumber).getNumericCellValue();
	wb.close();
	return value;
}
}
