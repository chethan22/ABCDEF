package Common;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
public static CharSequence ItemName3;

public static void main (String [] args) throws IOException{
	

    File src=new File(loginbase.Filepath);
    FileInputStream fis=new FileInputStream(src);

    XSSFWorkbook wb=new XSSFWorkbook(fis);
    XSSFSheet sheet2=wb.getSheetAt(1);
    //System.out.println(wb);
    int rowcount=sheet2.getLastRowNum();
    System.out.println("Total Row:  " + rowcount);
    Cell cell1 = sheet2.getRow(1).getCell(0); 
    //getting ItemName
    String ItemName= cell1.getStringCellValue();
    System.out.println("ItemName: "+ItemName);
     
    wb.close();   
	
	String ValueSplitByColon[] = ItemName.split("_");
	String part1 = ValueSplitByColon[0]; 
	System.out.println(part1);
	String part2 = ValueSplitByColon[1] ;
	System.out.println(part2);
	 int i= Integer.parseInt(part2);
	int ItemName2=i+1;
	System.out.println(ItemName2);	
	String ItemName3 = part1+"_"+ItemName2;
	System.out.println(ItemName3);
	
//create an object of Workbook and pass the FileInputStream object into it to create a pipeline between the sheet and eclipse.
FileInputStream fis2= new FileInputStream("D:\\Selenium\\BLMA\\TestData\\TestInput.xlsx");
XSSFWorkbook workbook = new XSSFWorkbook(fis2);

XSSFSheet sheet = workbook.getSheet("CreateItem");


Row row = sheet.getRow(1);
Cell cell = row.getCell(0);
cell.setCellValue(ItemName3);
FileOutputStream fos = new FileOutputStream("D:\\Selenium\\BLMA\\TestData\\TestInput.xlsx");
workbook.write(fos);
workbook.close();
fos.close();
System.out.println("END OF WRITING DATA IN EXCEL");
}
}
