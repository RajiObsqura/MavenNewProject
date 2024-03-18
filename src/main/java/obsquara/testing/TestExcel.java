package obsquara.testing;
import java.io.IOException;

public class TestExcel {
	public static void main(String[] args)throws IOException
	{
		String s=ExcelCode.readStringData(0,0);
		System.out.println(s);
		double d=ExcelCode.readNumericData(1,1);
	    System.out.println(d);
	}

}
