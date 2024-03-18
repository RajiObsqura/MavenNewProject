package obsquara.testing;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
	
	public static FileInputStream f;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	
	public static String readStringData(int i,int j)throws IOException
	{
		f=new FileInputStream("D:\\javaprograms\\mavenexcel.xlsx");
		wb= new XSSFWorkbook(f);
		sh=wb.getSheet("sheet1");
		XSSFRow r =sh.getRow(i);
		XSSFCell c=r.getCell(j);
		return c.getStringCellValue();
		
	}
	public static double readNumericData(int i,int j)throws IOException
	{
		f=new FileInputStream("D:\\javaprograms\\mavenexcel.xlsx");
		wb=new XSSFWorkbook(f);
		sh=wb.getSheet("sheet1");
		XSSFRow r=sh.getRow(i);
		XSSFCell c=r.getCell(j);
		return c.getNumericCellValue();
		
	}

}
