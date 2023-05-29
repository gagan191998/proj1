package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetch_Xl_data {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//step1
		FileInputStream fis = new FileInputStream("./EXCEL/testdata.xlsx");
		//step2
		Workbook book = WorkbookFactory.create(fis);
		//step3
	Sheet sh = book.getSheet("Sheet1");
		//step4
	Row r = sh.getRow(0);
	//step5
	Cell c = r.getCell(1);
	//step6
	String value = c.toString();
		System.out.println(value);
		
		
	
	}
	

}
