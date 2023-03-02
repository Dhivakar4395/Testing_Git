package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {
public static void particularData() throws IOException  {
File d = new File("C:\\Users\\iICON\\Desktop\\DataDriven.xlsx");
FileInputStream s = new FileInputStream(d);
Workbook ds = new XSSFWorkbook(s);
Sheet sheet = ds.getSheet("Contact Details");
Row row = sheet.getRow(0);
Cell cell = row.getCell(0);
CellType cellType = cell.getCellType();
if(cellType.equals(cellType.STRING)) {
	String stringCellValue = cell.getStringCellValue();
	System.out.println(stringCellValue);
}
else if (cellType.equals(cellType.NUMERIC)) {
	double numericCellValue = cell.getNumericCellValue();
	System.out.println(numericCellValue);
}
else
{
	System.out.println("Empty Value");
}
}
public static void main(String[] args) throws IOException {
	particularData();
}
}
