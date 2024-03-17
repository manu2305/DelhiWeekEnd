package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class FetchFromExcelFile {
@Test
public void data() throws EncryptedDocumentException, IOException {
	File file = new File("D:\\Selenium\\loginFile.xlsx");
	FileInputStream fis=new FileInputStream(file);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("Sheet1");
	int row = sheet.getPhysicalNumberOfRows();
	int colom = sheet.getRow(0).getPhysicalNumberOfCells();
	for (int i = 0; i <row; i++) {
		for (int j = 0; j <colom; j++) {
			String data = sheet.getRow(i).getCell(j).toString();
			System.out.println(data);
		}
	}
}
}
