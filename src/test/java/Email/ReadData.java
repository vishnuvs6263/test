package Email;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class ReadData {

	public static ArrayList<String> readExcelData(int colNum) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("E:\\Book1.xlsx");
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet sheet = wb.getSheet("Sheet1");
		Iterator<Row> rowIT = sheet.iterator();
		rowIT.next();
		ArrayList<String> list = new ArrayList<String>();
		while (rowIT.hasNext()) {
		list.add(rowIT.next().getCell(colNum).getStringCellValue());
		}
		
return list;
	}

}
