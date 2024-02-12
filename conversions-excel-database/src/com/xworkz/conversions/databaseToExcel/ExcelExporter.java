package com.xworkz.conversions.databaseToExcel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ExcelExporter {

    public static void exportToExcel(ResultSet resultSet, String outputPath) throws SQLException, IOException {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Sheet1");
        ResultSetMetaData metaData = resultSet.getMetaData();
        // Create the header row
        Row headerRow = sheet.createRow(0);
        for (int i = 1; i <= metaData.getColumnCount(); i++) {
            Cell cell = headerRow.createCell(i - 1);
            cell.setCellValue(metaData.getColumnName(i));
        }

        // Create data rows
        int rowNumber = 1;
        while (resultSet.next()) {
            Row row = sheet.createRow(rowNumber);
            for (int i = 1; i <= metaData.getColumnCount(); i++) {
                Cell cell = row.createCell(i - 1);
                cell.setCellValue(resultSet.getString(i));
            }
            rowNumber++;
        }
        // Save the workbook to a file
        try (FileOutputStream outputStream = new FileOutputStream(outputPath)) {
            workbook.write(outputStream);
        }


    }
}
