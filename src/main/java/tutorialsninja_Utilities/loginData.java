package tutorialsninja_Utilities;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class loginData {
		
@DataProvider(name="LoginData")
	/*public static void main(String[] args) throws EncryptedDocumentException, IOException {
		loginData test=new  loginData();
		test.getdata("loginData");
	}*/
	
	public String[][] getdata(Method m) throws EncryptedDocumentException, IOException
	{
		String exclesheetname=m.getName();
		File fil= new File("C:\\Users\\91735\\eclipse-workspace\\java_framework\\tutorialsninja_ComFrameWork\\src\\test\\resources\\tutorialsninja_Data\\tutorial_TestDatas.xlsx");
		FileInputStream fis= new FileInputStream(fil);
		Workbook wb =WorkbookFactory.create(fis);
		//Sheet sheetName=wb.getsheet("")
        org.apache.poi.ss.usermodel.Sheet sheetName= wb.getSheet(exclesheetname);
		
		int totalRows=sheetName.getLastRowNum();
		System.out.println(totalRows);
		Row rowCells=sheetName.getRow(0);
		int totalcols=rowCells.getLastCellNum();
		System.out.println(totalcols);
		
		DataFormatter format=new DataFormatter();
		String testData[][]=new String[totalRows][totalcols] ;
		for(int i=1;i<totalRows;i++)
		{
			for(int j=0;j<totalcols;j++)
			{
				testData[i-1][j]=format.formatCellValue(sheetName.getRow(i).getCell(j));
				System.out.println(testData[i-1][j]);
			}
		}
		return testData;
	}

}
