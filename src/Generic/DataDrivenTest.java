package Generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenTest {
	static String path="C:\\Users\\TRIDIP\\OneDrive\\Documents\\TestData.xlsx";
	static String value;
	static String excelCellValue(String sheet,int row,int cell) {
		try {
			FileInputStream testsheet=new FileInputStream(path);
			value = WorkbookFactory.create(testsheet).getSheet(sheet).getRow(row).getCell(cell).toString();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}
	
}
