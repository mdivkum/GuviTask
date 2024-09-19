package task8.GuviTask;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWR {
	public static void main(String[] args) throws IOException {
	
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Employee Sheet");
		
		ArrayList<Object[]> empdata=new ArrayList<Object[]>();
		empdata.add(new Object[] {"Name","Age","EmailId"});
		empdata.add(new Object[] {"John Doe",30,"John@test.com"});
		empdata.add(new Object[] {"Jane Doe",28,"John@test.com"});
		empdata.add(new Object[] {"Bob Smith",35,"Jacky@example.com"});
		empdata.add(new Object[] {"Swapnil",37,"Swapnil@example.com"});
        
		int rownum=0;
        for(Object[]emp:empdata){
	
	    XSSFRow row=sheet.createRow(rownum++);
	
	    int cellnum=0;
	    for (Object Value:emp){
		XSSFCell cell=row.createCell(cellnum++);

		if(Value instanceof String)
			cell.setCellValue((String) Value);
		if(Value instanceof Integer)
		cell.setCellValue((Integer) Value);
		if(Value instanceof Boolean)
	    cell.setCellValue((Boolean) Value);
		}
}
	String filepath="Util\\Task.xlsx";
	FileOutputStream out=new FileOutputStream(filepath);
	workbook.write(out);
	out.close();
	System.out.println("Employee file created successfully " +rownum + "");
	}
}
