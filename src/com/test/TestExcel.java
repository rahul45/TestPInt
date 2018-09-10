package com.test;

import java.awt.List;
import java.io.FileInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.regex.Pattern;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class TestExcel {
	
	public static ArrayList<String> min2() {
		ArrayList<String> list = new ArrayList<>();
		try {
			InputStream is = new FileInputStream("C:\\Users\\rahulb9\\Downloads\\test.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(is);

			XSSFSheet sheet1 = wb.getSheetAt(0);
			System.out.println("Reading Sheet: " + sheet1.getSheetName());
			Iterator<Row> iterator = sheet1.rowIterator();
			int count =0;
			while (iterator.hasNext()) {
				XSSFRow row = (XSSFRow) iterator.next();
				Iterator<Cell> it = row.cellIterator();
				while (it.hasNext()) {
					Cell cell = it.next();
					//System.out.println("index:"+cell.getColumnIndex());
					if (cell.getColumnIndex() == 14) {
						switch (cell.getCellType()) {
						case Cell.CELL_TYPE_NUMERIC:
							if (DateUtil.isCellDateFormatted(cell))
								System.out.println("Date cell value at " + cell.getColumnIndex() + ", "
										+ cell.getRowIndex() + ": " + cell.getDateCellValue());
							else
								System.out.println("Numeric cell value at " + cell.getRowIndex() + ", "
										+ cell.getColumnIndex() + ": " + cell.getNumericCellValue());
							break;
						case Cell.CELL_TYPE_BOOLEAN:
							System.out.println("Boolean cell value at " + cell.getRowIndex() + ", "
									+ cell.getColumnIndex() + ": " + cell.getBooleanCellValue());
							break;

						case Cell.CELL_TYPE_STRING:
							//System.out.println("String cell value at " + cell.getRowIndex() + ", "
							//		+ cell.getColumnIndex() + ": " + cell.getStringCellValue());
							//System.out.println("Print__"+cell.getRichStringCellValue());
							
							String value=String.valueOf(cell.getStringCellValue());
							if(!value.contains("%")){
								break;
							}
							String arr[]=value.split(" ");
							
							String temp=null;
							if(arr[1].equalsIgnoreCase("IGST")){
								temp = "IN";
							}else{
							if(arr[1].equalsIgnoreCase("SGST")){
								temp = "IS";
							}
							if(arr[1].equalsIgnoreCase("CGST")){
								temp = "IS";
							}
							}
							String intVal = null;
							String []p =(String[]) arr[2].split(Pattern.quote("."));
							//System.out.println("arr[2]"+arr[2]+"__"+arr[2].split("."));
							if(arr[2].contains(".")){
								//System.out.println("yes....");
							}
							intVal = p[0];
							String after = p[1].replace("%", "");
							if(after.charAt(0)=='0'){
							}else{
								intVal=intVal+"."+after.charAt(0);
							}
							System.out.print(++count+"-Rahul_"+arr[0]+"_"+temp+"_"+intVal+"%\n");
							list.add("Rahul_"+arr[0]+"_"+temp+"_"+intVal+"%");
						}
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;

	}

	public static void main(String[] args) {
		
		try {
			ArrayList<String> list =min2();
			main1(list);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
    public static void main1(ArrayList<String> list) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Java Books");
        /* 
        Object[][] bookData = {
                {"Head First Java", "Kathy Serria", 79},
                {"Effective Java", "Joshua Bloch", 36},
                {"Clean Code", "Robert martin", 42},
                {"Thinking in Java", "Bruce Eckel", 35},
        };*/
        	int rowCount = 0;
            int columnCount = 0;
            for (String str : list) {
            	 Row row = sheet.createRow(++rowCount);
            	Cell cell = row.createCell(columnCount);
                    cell.setCellValue((String) str);
                }
        try (FileOutputStream outputStream = new FileOutputStream("D:\\JavaBooks.xlsx")) {
            workbook.write(outputStream);
            System.out.println("Writeenb");
        }
    }
 
}

