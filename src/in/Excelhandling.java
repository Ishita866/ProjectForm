package in;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excelhandling {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\Documents\\testinfo.xlsx");

		Workbook book = WorkbookFactory.create(fis);

		Sheet sheet = book.getSheet("sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);

		String un = cell.getStringCellValue();
		Cell pass = row.getCell(1);
		String password = pass.getStringCellValue();
		
		Cell no = row.getCell(2);

		System.out.println(un);
		System.out.println(password);
		System.out.println(no);

	}

}
