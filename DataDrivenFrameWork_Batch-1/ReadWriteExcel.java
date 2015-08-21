import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;


public class ReadWriteExcel {
	
	public static void main(String[] args) throws Exception {
		readExcel();
	}
	
	public static Object[][] readExcel() throws Exception{
		int row = 100;
		int col = 2;
		int colStart = 0;
		int rowStart = 0;
		boolean isFirstTimeInTheLoop= false;
				
		Object [][] userArray= new Object[row][col]; 
		// This is for Opening an Excel File
		FileInputStream file = 
				new FileInputStream("D:\\Selenium-WS\\xls-file\\Users.xls");
		HSSFWorkbook workbook = new HSSFWorkbook(file);
		HSSFSheet  sheet = workbook.getSheetAt(0);
		Iterator<Row> rows = sheet.iterator();
		while(rows.hasNext()){
			Row currentRow = rows.next();
			Iterator<Cell> cells = currentRow.cellIterator();
			colStart = 0;
			if(isFirstTimeInTheLoop==false){
				isFirstTimeInTheLoop = true;
				continue; // Skip the Current Loop
			}
			while(cells.hasNext()){
				Cell currentCell = cells.next();
				if(currentCell.getCellType()==Cell.CELL_TYPE_STRING){
					userArray[rowStart][colStart] = currentCell.getStringCellValue();
				}
				else
				if(currentCell.getCellType()==Cell.CELL_TYPE_NUMERIC){
					userArray[rowStart][colStart] = currentCell.getNumericCellValue();
				}
				colStart++;
			}
			rowStart++;
		}
		
		System.out.println("*******************************************");
		for(int i = 0 ; i<row; i++){
			for(int j= 0 ; j<col; j++ ){
				System.out.print(userArray[i][j]+" \t");
			}
			System.out.println();
		}
		return userArray;
	}

}
