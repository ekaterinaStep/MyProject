package test;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class excel_read {

		public static void main(String[] args) throws Exception {
			
			String filePath="/Users/use/Desktop/milage.xlsx";
			
			FileInputStream input = new FileInputStream(filePath);
			Workbook workbook = WorkbookFactory.create(input);
			Sheet worksheet = workbook.getSheetAt(0);
			Row row = worksheet.getRow(0);
			Cell cell = row.getCell(0);
			
//			System.out.println(cell.toString());
			
			int rowNumsCount = worksheet.getLastRowNum();
//			System.out.println(rowNumsCount);
			
			for(int i=0; i<rowNumsCount; i++) {
				row = worksheet.getRow(i);
				cell= row.getCell(0);
				System.out.println(cell.toString());
			}
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.calculators.org/savings/wage-conversion.php");
			
			WebElement wage = driver.findElement(By.name("wage"));
			WebElement weekHours = driver.findElement(By.name("weekHours"));
			WebElement monthly = driver.findElement(By.xpath("//form[@name='calc'] //tr[9]//td[2]"));
			WebElement anually= driver.findElement(By.xpath("//form[@name='calc'] //tr[11]//td[2]"));
			
			
			
			
			
		}
}
