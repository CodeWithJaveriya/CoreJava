package com.xworkz.conversions.excelToDatabse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Tester1 {

    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement stmt = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "jav@123");
            // Load the Excel file
            FileInputStream excelFile = new FileInputStream(new File("C:\\Users\\Javeriya Taj\\OneDrive\\Desktop\\UniversityData.xlsx"));

            Workbook workbook = new XSSFWorkbook(excelFile);

            Sheet sheet = workbook.getSheetAt(0);

            stmt = con.prepareStatement("INSERT INTO university_info  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

            // Skip the header row (assuming it's the first row)
            for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
                Row row = sheet.getRow(rowIndex);
                stmt.setString(1, row.getCell(0).getStringCellValue());
                stmt.setString(2, row.getCell(1).getStringCellValue());
                stmt.setString(3, row.getCell(2).getStringCellValue());
                stmt.setString(4, row.getCell(3).getStringCellValue());
                stmt.setString(5, row.getCell(4).getStringCellValue());
                stmt.setString(6,row.getCell(5).getStringCellValue());
                stmt.setString(7, row.getCell(6).getStringCellValue());
                stmt.setString(8, row.getCell(7).getStringCellValue());
                stmt.setString(9, row.getCell(8).getStringCellValue());
                stmt.setString(10, row.getCell(9).getStringCellValue());
                stmt.executeUpdate();
            }

            // Close resources
            stmt.close();
            con.close();
            excelFile.close();
            workbook.close();

            System.out.println("Data imported from Excel to MySQL successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


