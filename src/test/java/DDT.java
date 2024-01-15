import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.streaming.DeferredSXSSFWorkbook;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		XSSFWorkbook ExcelWBook = null;
		XSSFSheet ExcelWSheet;
		XSSFRow Row;
		XSSFCell Cell;
		
		//Create an object of file class to open file
		File excelFile = new File("E:\\TestDataFile.xlsx");
		FileInputStream inputStream = null;
		
		//Create an object of FileInputStream to read data from file
		try {
			 inputStream = new FileInputStream(excelFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Excel-workbook-sheet-row-cell
		//Create object of XSSFWorkbook to handle xlsx file
		ExcelWBook = new XSSFWorkbook(inputStream);
		//To access workbook sheet
		ExcelWSheet = ExcelWBook.getSheetAt(0);
		
		//get total row count
		int totalRows = ExcelWSheet.getLastRowNum()+1;
		
		//get total no of cells in row
		int totalCells = ExcelWSheet.getRow(0).getLastCellNum();
		
		for (int currentRow=1; currentRow<totalRows; currentRow++)
		{
			    System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Chrome\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.saucedemo.com/");
				driver.manage().window().maximize();
				driver.findElement(By.id("user-name")).sendKeys(ExcelWSheet.getRow(currentRow).getCell(0).toString());
				driver.findElement(By.id("password")).sendKeys(ExcelWSheet.getRow(currentRow).getCell(1).toString());
				driver.findElement(By.id("login-button")).click();
				Thread.sleep(2000);
				
			for(int currentCell=0; currentCell<totalCells; currentCell++)
			{
				System.out.print(ExcelWSheet.getRow(currentRow).getCell(currentCell).toString());
				System.out.print("\t");
			}
			driver.quit();
		}
		ExcelWBook.close();
	}

}
